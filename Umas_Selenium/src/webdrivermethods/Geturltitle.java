package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturltitle
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://gmail.com/");
		Thread.sleep(500);
		
		System.out.println(driver.getTitle());
		
		String Title=driver.getTitle();
		System.out.println("Title is:"+Title);
		
		driver.get("https://google.com/");
		Thread.sleep(500);
		
		System.out.println(driver.getCurrentUrl());
		
		String url=driver.getCurrentUrl();
		System.out.println("URL is:"+url);

	}

}
