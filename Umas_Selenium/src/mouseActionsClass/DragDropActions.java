package mouseActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropActions {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(6000);
		Actions act=new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dest = driver.findElement(By.id("amt7"));
		//Thread.sleep(1000);
//		1st Way
//		act.moveToElement(src).clickAndHold().release(dest).build().perform();

//		2nd Way
		act.dragAndDrop(src, dest).perform();
	}

}
