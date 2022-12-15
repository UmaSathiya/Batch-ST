package keyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownActions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);		//create an object for Actions class
		
		WebElement newacc = driver.findElement(By.xpath("//a[contains(@id,'u_0')]"));
		
		act.click(newacc).perform();
		Thread.sleep(2000);
//		dropdown using Keyboard Actions
		
		WebElement day = driver.findElement(By.id("day"));
				
		act.moveToElement(day).click().build().perform();
						
		for(int i=1;i<=4;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
				
		WebElement month = driver.findElement(By.id("month"));
		act.click(month).perform();
				
		for(int j=1;j<=5;j++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
	}

}
