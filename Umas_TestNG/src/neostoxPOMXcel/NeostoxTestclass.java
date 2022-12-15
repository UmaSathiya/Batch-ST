package neostoxPOMXcel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NeostoxTestclass 
{
	WebDriver driver;
	SigninPage signin;
	PasscodePage pass;
	HomePage home;
	InstructPage instruct;
	PlanPage plan;
	File myfile;
	Sheet mysheet;
	
  @BeforeClass
  public void LaunchBrowser() throws EncryptedDocumentException, IOException
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
		
	  driver.manage().window().maximize();
	  driver.get("https://neostox.com/sign-in");
	  Reporter.log("launching Browser", true);
	  
	  signin=new SigninPage(driver);
	  pass=new PasscodePage(driver);
	  home=new HomePage(driver);
	  instruct =new InstructPage(driver);
	  plan=new PlanPage(driver);
	  
	  myfile=new File("D:\\SELENIUM\\Xcel.xlsx");
	  mysheet=WorkbookFactory.create(myfile).getSheet("Sheet5");
  }
  @BeforeMethod
  public void SigninToAppln() throws InterruptedException
  {
	  signin.enterMobNo(mysheet.getRow(1).getCell(0).getStringCellValue());
	  signin.clickSignin();
	  Reporter.log("Sending MobileNo,clicksigninbutton", true);
	  Thread.sleep(1000);
	  
	  pass.enterpasscode(mysheet.getRow(1).getCell(1).getStringCellValue());
	  Reporter.log("Sending Passcode",true);
	  pass.clicksubmit();
	  Thread.sleep(3000);

	  instruct.clickcancel();;
	  Reporter.log("Clicking X button",true);
	  Thread.sleep(2000);
	  
	  plan.clickclose();
	  Reporter.log("Clicking close button",true);
	  Thread.sleep(5000);
  }
  @Test
  public void validateusername() throws IOException 
  {
	  String ExpuserID=mysheet.getRow(1).getCell(2).getStringCellValue();
	  String ActuserID=home.getActUsername(driver);
	  Assert.assertEquals(ActuserID,ExpuserID,"TC failed actual and expected is not matching");
	  Reporter.log("Validate User ID and taking screenshot", true);
	  System.out.println("TC passed");

	  String ExpuserBal=mysheet.getRow(1).getCell(3).getStringCellValue();
	  String ActuserBal=home.getActUserBal(driver);
	  Assert.assertEquals(ActuserBal,ExpuserBal,"TC failed actual and expected is not matching");
	  Reporter.log("Validate User Bal and taking screenshot", true);
  }
  @AfterMethod
  public void LogoutfromApln()
  {
	 home.clickdropdown();
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
