package dynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraApp 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("tote bags");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		
		WebElement ratings = driver.findElement(By.xpath("(//div[@class='product-ratingsCount'])[9]"));
		System.out.println(ratings.getText());
		
		WebElement text = driver.findElement(By.xpath("(//li[@class='product-base'])[6]"));
		System.out.println(text.getText());
		Thread.sleep(500);
		WebElement brand = driver.findElement(By.xpath("(//h3[@class='product-brand'])[8]"));
		System.out.println(brand.getText());
		
		WebElement rating = driver.findElement(By.xpath("((//li[@class='product-base'])[4]//div)[2]"));
		System.out.println(rating.getText());
	}

}
