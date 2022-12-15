package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrvMthds 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//img[@alt='Selenium Online Training']")).click();
		Thread.sleep(500);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().forward();
		Thread.sleep(500);
		driver.navigate().refresh();
		Thread.sleep(500);
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.close();
		driver.quit();
	}

}
