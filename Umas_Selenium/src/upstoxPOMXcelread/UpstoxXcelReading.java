package upstoxPOMXcelread;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxXcelReading 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(2000);
		
		File file = new File("D:\\SELENIUM\\Xcel.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(file).getSheet("Sheet3");
		String userid = mysheet.getRow(0).getCell(0).getStringCellValue();

//Create an object for LoginPage
		LoginPage login=new LoginPage(driver);
		login.enterUserId(userid);
		login.enterpassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		login.clickSigninButton();
		Thread.sleep(2000);
		
//Create an object for PasscodePage		
		PasscodePage passcode=new PasscodePage(driver);
		passcode.enterPasscode(mysheet.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(2000);
		
//Create an object for WelcomePage		
		WelcomePage wel=new WelcomePage(driver);
		wel.clickNoImGudButton();
		Thread.sleep(2000);
		
//Create an object for HomePage		
		HomePage home=new HomePage(driver);
		//HPageCommonMtds home=new HPageCommonMtds(driver);
		home.ValidateUsername(mysheet.getRow(0).getCell(3).getStringCellValue());
		//home.ValidateUser(mysheet.getRow(0).getCell(3).getStringCellValue(), driver);
		home.clickfunds();
		Thread.sleep(2000);
		
//Create an object for FundsPage		
		Fundspage fund=new Fundspage(driver);
		fund.getfundvalue();
		
		home.clicklogout();
		driver.close();
	}
}
