package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Neostoxpass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.get("https://neostox.com/sign-in");
		
		driver.findElement(By.id("MainContent_signinsignup_txt_mobilenumber")).sendKeys("9655006739");
		driver.findElement(By.id("lnk_signup1")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("txt_accesspin")).sendKeys("1012");
		driver.findElement(By.id("lnk_submitaccesspin")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@class='close'])[19]//span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='Close'])[5]")).click();
	}

}
