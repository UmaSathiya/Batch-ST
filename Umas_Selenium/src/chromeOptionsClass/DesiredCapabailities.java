package chromeOptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapabailities 
{
	public static void main(String[] args) 
	{
		ChromeOptions opt=new ChromeOptions();
		
//		DesiredCapabilities dc=new DesiredCapabilities();
//		dc.setCapability(ChromeOptions.CAPABILITY, opt);
		opt.addArguments("--disable-notifications");
		//opt.addArguments("disable-infobars");
		opt.addArguments("start-maximized");
		//opt.addArguments("incognito");
		//opt.addArguments("headless");
		
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.ajio.com/");

	}

}
