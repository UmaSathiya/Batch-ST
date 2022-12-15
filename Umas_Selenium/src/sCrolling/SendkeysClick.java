package sCrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethods.CommonUsedMethods;

public class SendkeysClick 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		CommonUsedMethods.Implicitwait(driver, 100);
		WebElement text = driver.findElement(By.id("name"));
		
		CommonUsedMethods.ScrollIntoView(driver, text);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='usece10'", text);
			
		WebElement alert = driver.findElement(By.id("alertbtn"));
		js.executeScript("arguments[0].click()",alert);
	}
}
