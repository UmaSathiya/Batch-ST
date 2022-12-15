package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//						GetText of the Whole Table by using FindElements Method/For each loop

public class Example3 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		 List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		for(WebElement r:rows)
		{
			System.out.print(r.getText()+" ");
			System.out.println();
		}

	}

}
