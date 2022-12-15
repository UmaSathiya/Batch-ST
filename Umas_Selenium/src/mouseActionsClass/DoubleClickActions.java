package mouseActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(500);
		
//		Double click Action
		Actions A = new Actions(driver);
		
		WebElement dclkbutton = driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
		Thread.sleep(1000);

//		1st way
//		A.moveToElement(dclkbutton).perform();
//		A.doubleClick().perform();
		
//		2nd way
//		A.moveToElement(dclkbutton).doubleClick().build().perform();
		
//		3rd way
		A.doubleClick(dclkbutton).perform();

	}

}
