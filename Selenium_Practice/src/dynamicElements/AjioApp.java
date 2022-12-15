package dynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AjioApp 
{
	public static void main(String[] args)
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("start-maximized");
		
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.ajio.com/");

		driver.findElement(By.name("searchVal")).sendKeys("shoes");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement price = driver.findElement(By.xpath("((//div[@class='contentHolder'])[1]//span)[1]"));
		
		System.out.println(price.getText());
	}

}
