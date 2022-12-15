package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElmtMthds {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(500);
		WebElement textbox = driver.findElement(By.name("fname"));
		textbox.clear();
		Thread.sleep(1000);
		textbox.sendKeys("Hello");
		System.out.println(textbox.isDisplayed());
		System.out.println(driver.findElement(By.id("but1")).isEnabled());
		
		WebElement radio = driver.findElement(By.id("radio2"));
		radio.click();
		System.out.println(radio.isSelected());
		
	}

}
