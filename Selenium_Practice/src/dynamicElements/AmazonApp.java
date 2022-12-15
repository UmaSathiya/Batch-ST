package dynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonApp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "D:\\SELENIUM\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		Thread.sleep(500);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		WebElement reviews = driver.findElement(By.xpath("((//div[@class='sg-col-inner'])[6]//span)[15]"));
		System.out.println(reviews.getText());
	}

}
