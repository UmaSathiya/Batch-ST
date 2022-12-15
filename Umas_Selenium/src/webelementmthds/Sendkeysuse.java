package webelementmthds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeysuse 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
//		FRESHER/CHILD CODING
		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("usece10");
//		
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("maheseelan12");
//		
//		driver.findElement(By.xpath("//button[@name='login']")).click();
		
//		EXPERIENCE WAY OF CODING
//		Return type of Findelement is Webelement
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		
		email.sendKeys("usece10");
		
		Thread.sleep(200);
		
		email.clear();		//clear() is one type of webelement method
		
		Thread.sleep(200);
		
		email.sendKeys("sathiya");
		Thread.sleep(500);
		//driver.close();
		
		driver.get("https://gmail.com/");
		
		driver.quit();
	}

}
