package collectionList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDFblist 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		Thread.sleep(500);
		
		System.out.println("==================Days Dropdown List=============");
		WebElement Day = driver.findElement(By.id("day"));
		Select d1=new Select(Day);
				
		List<WebElement> day1 = d1.getOptions();
		for(WebElement d:day1)
		{
			System.out.println(d.getText());
		}
		System.out.println("Day size-"+day1.size());
		
		System.out.println("===============Month Dropdown List===============");
		WebElement Month = driver.findElement(By.id("month"));
		Select m1=new Select(Month);
				
		List<WebElement> month = m1.getOptions();
		for(WebElement m:month)
		{
			System.out.println(m.getText());
		}
		System.out.println("Month Size:"+month.size());
		
		System.out.println("===============Year Dropdown List===============");
		
		WebElement year = driver.findElement(By.id("year"));
		Select y1=new Select(year);
		
		List<WebElement> year1 = y1.getOptions();
		for(WebElement y:year1)
		{
			System.out.println(y.getText());
		}
		System.out.println("Year Dropdown size:"+year1.size());
	
	
	
	}

}
