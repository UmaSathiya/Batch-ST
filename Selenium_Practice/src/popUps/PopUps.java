package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String mainId = driver.getWindowHandle();
		System.out.println(mainId);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		
//		get id of individual pages
		
		Iterator<String> id = allId.iterator();
		String mid = id.next();
		String cid = id.next();

//		switch selenium focus to child browser
		
		driver.switchTo().window(cid);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement text = driver.findElement(By.id("para1"));
		System.out.println(text.getText());
		
//		switch selenium focus to main page
		
		driver.switchTo().window(mid);
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(1000);
		
//		Alert popup handles
//		driver.switchTo().alert().accept();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
//		after closing the alert popup action performed in the main page
		
		text=driver.findElement(By.xpath("//h1[@class='title']"));
		System.out.println(text.getText());
	}
}
