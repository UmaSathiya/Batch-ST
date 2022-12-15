package collectionList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoglesearchList 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("samsung");
		Thread.sleep(500);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e'][1]/li"));
		for(WebElement l:list)
		{
			System.out.println(l.getText());
			String expected="samsung s21";
			String actual=l.getText();
			if(expected.equalsIgnoreCase(actual))
			{
				l.click();
				break;
			}
		}
		System.out.println("Size:"+list.size());
		
		driver.findElement(By.linkText("Images")).click();
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Images list:"+images.size());
		
	}

}
