package neostoxPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neostoxPOMXcel.HomePage;
import neostoxPOMXcel.InstructPage;
import neostoxPOMXcel.PlanPage;

public class Testneostox 
{	
	WebDriver driver;
	SignPage s1;
	PasswordPage p1;
	HomePage h1;
	InstructPage i1;
	PlanPage p2;
	
	@BeforeClass
	public void LaunchingBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
			
		  driver.manage().window().maximize();
		  driver.get("https://neostox.com/sign-in");
		  
		  s1=new SignPage(driver);
		  p1=new PasswordPage(driver);
		  i1=new InstructPage(driver);
		  p2=new PlanPage(driver);
		  h1=new HomePage(driver);
	}
	@BeforeMethod
	public void Signin() throws InterruptedException
	{
		  s1.enterMobNo();
		  s1.clickSignin();
		  Reporter.log("Sending MobileNo,clicksigninbutton", true);
		  Thread.sleep(4000);
		  
		  p1.enterpasscode();
		  p1.clicksubmit();
		  Reporter.log("Sending Passcode",true);
		  Thread.sleep(4000);
		  
		  i1.clickcancel();
		  Reporter.log("Clicking X button",true);
		  
		  p2.clickclose();
		  Reporter.log("Clicking close button",true);
		  Thread.sleep(3000);
	}
	@Test
	public void validateuser() throws IOException
	{
		  String ExpuserID="Hi Sathiya SM";
		  String ActuserID=h1.getActUsername(driver);
		  Assert.assertEquals(ActuserID,ExpuserID,"TC failed actual and expected is not matching");
		  Reporter.log("Validate User ID and taking screenshot", true);
		  System.out.println("TC passed");

		  String ExpuserBal="Rs.5,00,000.00";
		  String ActuserBal=h1.getActUserBal(driver);
		  Assert.assertEquals(ActuserBal,ExpuserBal,"TC failed actual and expected is not matching");
		  Reporter.log("Validate User Bal and taking screenshot", true);
	}
	@AfterMethod
	public void logoutapln()
	{
		  h1.clickdropdown();
		  h1.clicklogout();
		  Reporter.log("logging out from application", true);
	}
	@AfterClass
	public void Closingbrowser()
	{
		driver.close();
		Reporter.log("Closing the browser", true);
	}

}
