package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import utility.UtilityNeoProp;

public class BaseNeoProp 
{
	protected WebDriver driver;
	
	public void LaunchBrowser() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityNeoProp.readdatafromPropfile("url"));
		Reporter.log("Launching Browser",true);
		Thread.sleep(1000);
	}
}
