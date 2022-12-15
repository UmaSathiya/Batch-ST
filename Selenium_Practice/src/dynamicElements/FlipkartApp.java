package dynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartApp
{
	public static void main(String[] args) throws InterruptedException
	{
//		HashMap<String, Object> edgePrefs = new HashMap<String, Object>();
//		edgePrefs.put("profile.default_content_settings.popups", 0);
//		edgePrefs.put("profile.default_content_setting_values.notifications", 2);	
//		EdgeOptions Options = new EdgeOptions();
//		Options.setExperimentalOption("prefs",edgePrefs);
		
		System.setProperty("webdriver.edge.driver", "D:\\SELENIUM\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.linkText("Electronics")).click();
		
		Actions act=new Actions(driver);
		
//		WebElement link = driver.findElement(By.xpath("(//span[text()='Electronics']"));
//		Thread.sleep(2000);
//		act.moveToElement(link).perform();
		
//		for(int i=1;i<=3;i++)
//		{
//			act.sendKeys(Keys.ARROW_DOWN).perform();
//		}
//		
//		act.sendKeys(Keys.ENTER).perform();
		
		WebElement text = driver.findElement(By.xpath("(((//div[@class='_1fwVde'])[1])//a)[6]"));
		
		act.moveToElement(text).click().build().perform();
		

	}

}
