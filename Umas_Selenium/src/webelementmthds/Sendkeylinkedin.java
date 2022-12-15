package webelementmthds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeylinkedin
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.linkedin.com/");
		
		//driver.findElement(By.linkText("Sign in")).click();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("session_key")).sendKeys("Uma");
		
		driver.findElement(By.name("session_password")).sendKeys("xyz10");
		
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
	}

}
