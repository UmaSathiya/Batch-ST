package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframevctcEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		driver.switchTo().frame("courses-iframe");
		Thread.sleep(500);
		
		String text = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity')]")).getText();
		System.out.println("Iframe text-"+text);
		Thread.sleep(500);
		
		driver.switchTo().defaultContent();
		String text1 = driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]")).getText();
		System.out.println("Iframe text1-"+text1);

	}

}
