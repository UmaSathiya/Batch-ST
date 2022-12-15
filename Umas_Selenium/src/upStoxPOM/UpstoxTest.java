package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxTest 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(2000);
		
//Create object for	LoginPage		
		Loginpage login=new Loginpage(driver);
		login.enterUserId();
		login.enterpassword();
		login.clickSigninButton();
		Thread.sleep(2000);
		
//Create object for	PasscodePage
		PasscodePage passcode=new PasscodePage(driver);
		passcode.enterPasscode();
		Thread.sleep(2000);
		
//Create object for	WelcomePage
		WelcomePage welcome=new WelcomePage(driver);
		welcome.clickButton();
		Thread.sleep(2000);
		
//Create object for	HomePage
		HomePage home=new HomePage(driver);
		home.ValidateUsername();
		home.clickfunds();
		Thread.sleep(2000);	
		
//Create object for	FundsPage
		FundsPage fund=new FundsPage(driver);
		fund.getfundvalue();
		Thread.sleep(2000);
		
		home.clicklogout();
	}
}
