package collectionList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctclist 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(500);
		
		System.out.println("===========From station=====================");
		
		driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("M");
		Thread.sleep(1000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox'][1]//li"));
		for(WebElement l:list)
		{
			System.out.println(l.getText());
			String ex="MADURAI JN - MDU";
			String act=l.getText();
			if(ex.equals(act))
			{
				l.click();
				break;
			}
		}
		System.out.println("Size:"+list.size());
				
		System.out.println("===========To station=====================");
		
		driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("S");
		Thread.sleep(500);
		
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@role='listbox'][1]//li"));
		for(WebElement l1:list1)
		{
			System.out.println(l1.getText());
			String ex1="SALEM JN - SA";
			String act1=l1.getText();
			if(ex1.equals(act1))
			{
				l1.click();
				break;
			}
		}
		System.out.println("Size:"+list.size());	
	}

}
