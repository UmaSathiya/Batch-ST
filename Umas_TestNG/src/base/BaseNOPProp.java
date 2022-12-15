package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import utility.UtilityNopProp;

public class BaseNOPProp 
{

	protected WebDriver driver;
	
	public void Launchbrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityNopProp.readdatafromPropfile("url"));
		Reporter.log("Launching Browser",true);
//		Thread.sleep(1000);
	}
}
