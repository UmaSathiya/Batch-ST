package collectionList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDomayoList 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();		
		driver.get("https://omayo.blogspot.com/");
		WebElement drop = driver.findElement(By.id("drop1"));
		Select d=new Select(drop);
		
		List<WebElement> d1 = d.getOptions();
		for(WebElement D:d1)
		{
			System.out.println(D.getText());
		}
		System.out.println("Size:"+d1.size());
		
		driver.get("https://www.google.co.in/");
	}

}
