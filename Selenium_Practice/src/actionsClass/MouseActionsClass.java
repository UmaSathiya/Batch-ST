package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Actions act=new Actions(driver);
		
		WebElement dbleclk = driver.findElement(By.id("testdoubleclick"));

		act.doubleClick(dbleclk).perform();
		Thread.sleep(5000);
		WebElement clk = driver.findElement(By.xpath("//button[text()='Check this']"));
		
		act.moveToElement(clk).click().build().perform();
		Thread.sleep(2000);
		
		WebElement rgtclk = driver.findElement(By.linkText("onlytestingblog"));
		act.contextClick(rgtclk).perform();
		Thread.sleep(2000);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement src = driver.findElement(By.id("box2"));
		
		WebElement dest = driver.findElement(By.id("box102"));
		
		act.dragAndDrop(src, dest).perform();
	}

}
