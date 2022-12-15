package testNGupstoxPOMXcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGValidUpstUserID 
{
//globally declared variables-using inside many methods
	WebDriver driver;
	LoginPage login;
	WelcomePage wel;
	PasscodePage pass;
	HomePage home;
	File myfile;
	Sheet mysheet;
	
	@BeforeClass
	public void Launchbrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Reporter.log("launching Browser", true);
//creating object for pom class		
		login=new LoginPage(driver);
		wel=new WelcomePage(driver);
		pass=new PasscodePage(driver);
		home=new HomePage(driver);
		myfile=new File("D:\\SELENIUM\\Xcel.xlsx");
		mysheet=WorkbookFactory.create(myfile).getSheet("Sheet3");
	}
	@BeforeMethod
	public void logintoUpstox()
	{
//login page
		login.enterUserId(mysheet.getRow(0).getCell(0).getStringCellValue());
		login.enterpassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		login.clickSigninButton();
		Reporter.log("Sending Username,password,clicksigninbutton", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//passcode page
		pass.enterPasscode(mysheet.getRow(0).getCell(2).getStringCellValue());
		Reporter.log("Sending Passcode",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//welcome page		
		wel.clickNoImGudButton();
		Reporter.log("Click on No I'm Gud ", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
  @Test
  public void validateuserID() throws IOException 
  {
//validate user id in home page
	  String ExpuserID=mysheet.getRow(0).getCell(3).getStringCellValue();
	  String ActuserID=home.getActualuserID(driver);
	  Assert.assertEquals(ActuserID,ExpuserID,"TC failed actual and expected is not matching");
	  Reporter.log("Validate User ID and taking screenshot", true);
  }
  @AfterMethod 
  public void logoutUpstox() throws InterruptedException
  {
	  home.clicklogout();
	  Reporter.log("logging out from application", true);
  }
  @AfterClass
  public void closebrowser()
  {
	  Reporter.log("Closing the browser", true);
	  driver.close();
  }
}
