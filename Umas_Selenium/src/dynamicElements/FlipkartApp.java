package dynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartApp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.name("q")).sendKeys("pavilion laptop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(500);
		WebElement reviews = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
		Thread.sleep(500);
		System.out.println(reviews.getText());
		WebElement ratings = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[3]//span)[4]"));
		Thread.sleep(500);
		System.out.println(ratings.getText());
		
		
	}

}
