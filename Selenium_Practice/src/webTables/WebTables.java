package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> totalrow = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		System.out.println(totalrow.size());
		
		List<WebElement> totalcol = driver.findElements(By.xpath("//table[@id='table1']//td"));
		System.out.println(totalcol.size());
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=3;j++)
			{
				WebElement table = driver.findElement(By.xpath("//table[@id='table1']//tr["+i+"]//td["+j+"]"));
				System.out.print(table.getText()+" | ");
			}
			System.out.println();
		}
	}

}
