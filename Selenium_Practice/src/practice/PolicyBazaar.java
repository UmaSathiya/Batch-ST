package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PolicyBazaar 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions c = new ChromeOptions();
		c.addArguments("start-maximized");
		c.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);
		driver.manage().window().maximize();
//		CommonUsedMethods.Implicitwait(driver, 15); by using this it throws staleElementRefExcp
/*	implicit wait is waiting for the element to exist in the DOM.
*	Stale Element means an old element or no longer available element. 
*	If the DOM changes then the WebElement goes stale. If we try to interact with an element 
	which is staled then the StaleElementReferenceException is thrown.
*	To Overcome Stale Element Reference Exception use expicit wait/thread.*/

		driver.get("https://www.policybazaar.com/");
		
		driver.findElement(By.xpath("(//div[@class='shadowHandlerBox'])[1]")).click();
//		Thread.sleep(1000);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(5000));
		
		w.until(ExpectedConditions.elementSelectionStateToBe((By.xpath("//span[text()=' Female']")), false));
		driver.findElement(By.xpath("//span[text()=' Female']")).click();
	}
}
