package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		Thread.sleep(100);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(300);
		driver.navigate().to("https://gmail.com/");
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(700);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.close();
	}

}
