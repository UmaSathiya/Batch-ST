package mouseActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickActions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions a=new Actions(driver);
		
		WebElement cl = driver.findElement(By.xpath("//a[text()=' BANK '] "));
		Thread.sleep(1000);
		a.moveToElement(cl).perform();
		Thread.sleep(1000);
		
		WebElement clk = driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[2]"));
		
//		++++++++++++++++++++++first Way+++++++++++++++
//		a.moveToElement(clk).perform();
//		Thread.sleep(1000);
//		a.click().perform();
		
//		++++++++++++++2nd Way+++++++++++++++++++++++++multiple methods create build
//		a.moveToElement(clk).click().build().perform();
		
//		++++++++++++++++++3rd Way++++++++++++++++++++
		a.click(clk).perform();
	
	}

}
