package chromeOptions;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableInfobars 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions c = new ChromeOptions();
		c.setExperimentalOption("excludeSwitches",Collections.singleton("enable-automation"));
//		c.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		WebDriver driver= new ChromeDriver(c);
		
		driver.get("https://www.ajio.com/");
	}
}
