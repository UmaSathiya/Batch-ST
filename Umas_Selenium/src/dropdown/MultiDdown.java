package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDdown 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(500);
		WebElement multidropdown = driver.findElement(By.id("cars"));
		
		Select multi=new Select(multidropdown);
		
		multi.selectByIndex(1);
		Thread.sleep(500);
		
		multi.selectByValue("opel");
		Thread.sleep(500);
		
		multi.selectByVisibleText("Audi");
		Thread.sleep(500);
		
		multi.deselectByIndex(3);
		

	}

}
