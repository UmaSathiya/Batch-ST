package keyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteActions 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		
		Actions act=new Actions(driver);
		
		act.sendKeys(username, "usece10").perform();
		
		WebElement newacc = driver.findElement(By.xpath("//a[contains(@id,'u_0')]"));
		
		act.click(newacc).perform();
		
		Thread.sleep(1000);
				
		WebElement name = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		Thread.sleep(2000);
		
		act.moveToElement(name).click().sendKeys("Uma").build().perform();
		act.keyDown(name,Keys.CONTROL).sendKeys("a").build().perform();
		act.sendKeys("c").perform();
		Thread.sleep(1000);
		
		act.moveToElement(lastname).click().build().perform();
		act.keyDown(lastname,Keys.CONTROL).sendKeys("v").build().perform();
		Thread.sleep(2000);
	}	
}
