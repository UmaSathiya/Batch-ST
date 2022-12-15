package findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelmt 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("usece10");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Maheseelan12");
		
		driver.findElement(By.name("login")).click();
	}
}
