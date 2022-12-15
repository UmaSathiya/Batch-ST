package webdrivermthds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturltitlemthd 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		
		System.out.println("Title is:"+driver.getTitle());
		 Thread.sleep(1000);
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		System.out.println("Title is:"+driver.getTitle());
		
		driver.close();
	}

}
