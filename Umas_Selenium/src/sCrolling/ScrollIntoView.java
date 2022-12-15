package sCrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement mousehover = driver.findElement(By.id("mousehover"));
		
//	Scrolling into view
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",mousehover);
		System.out.println(mousehover.getText());
	}
}
