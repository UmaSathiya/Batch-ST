package chromeOptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Disablenotification {

	public static void main(String[] args) 
	{
		
		//HashMap<String, Object> prefs = new HashMap<String,Object>();
		//prefs.put("profile.default_content_setting_values.notifications",2);
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		//opt.setExperimentalOption("prefs",prefs);
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
	}
}
