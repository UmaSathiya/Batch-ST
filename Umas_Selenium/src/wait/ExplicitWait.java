package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(5000));
		
		w.until(ExpectedConditions.elementSelectionStateToBe((By.xpath("(//div[@id='#signIn'])[1]")), false));
		driver.findElement(By.xpath("(//div[@id='#signIn'])[1]")).click();
		
		 //w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='#signIn'])[1]")));
		//driver.findElement(By.xpath("(//div[@id='#signIn'])[1]")).click();
		//w.until(ExpectedConditions.elementSelectionStateToBe(signin, true));
		//signin.click();
	}

}
