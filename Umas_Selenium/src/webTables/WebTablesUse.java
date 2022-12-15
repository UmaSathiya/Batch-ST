package webTables;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesUse 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//howmany rows in the table
		
		List<WebElement> totalrow = driver.findElements(By.xpath("(//table[@id='product'])//tr"));
		System.out.println(totalrow.size());
		
		//howmany columns in the table
		
		List<WebElement> totalcolumn = driver.findElements(By.xpath("(//table[@id='product'])//td"));
		System.out.println(totalcolumn.size());
		
		//get the text present in the table
		
		WebElement mydata = driver.findElement(By.xpath("(((//table[@id='product']//tr)[7])/td)[2]"));
		System.out.println("My Data:"+mydata.getText());
		
		//how to get the specific row values using findelements--->Static Elements
		
		List<WebElement> row9 = driver.findElements(By.xpath("(((//table[@id='product'])//tr)[9])/td"));
		
		Iterator<WebElement> it = row9.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next().getText()+" | ");
		}
		System.out.println();
		System.out.println("===================================");
		//how to get the specific row values using findElement
		
		for(int i=1;i<=3;i++)
		{
			 String Row8 = driver.findElement(By.xpath("(((//table[@id='product'])//tr)[8])/td["+i+"]")).getText();
			 System.out.print(Row8+" | ");
		}
		
	}

}
