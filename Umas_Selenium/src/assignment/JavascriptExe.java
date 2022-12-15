package assignment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExe
{
	public static void main(String[] args) 
	{
//	Similar ways to send values to the textbox
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();		
		driver.get("https://facebook.com/");
		
//		WebElement un = driver.findElement(By.id("email"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
/*1.*/	js.executeScript("document.getElementById('email').value='usece10'");
//2.	js.executeScript("arguments[0].value='usece10'",un);
	}
}
