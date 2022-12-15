package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base 
{
	protected WebDriver driver;
	
	public void LaunchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/sign-in");
		Reporter.log("Launching Browser",true);
		Thread.sleep(1000);
		
	}

}
