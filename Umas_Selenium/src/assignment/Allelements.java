package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Allelements {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		//all elements present in a webpage
		
		List<WebElement> x = driver.findElements(By.xpath("//*"));
		System.out.println(x.size());
		for(WebElement q:x)
		{
			System.out.println(q.getText());
		}

	}

}
