package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(500);
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(500);
		
		driver.findElement(By.id("menuButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Change Theme')]")).click();

	}

}
