package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframe
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(500);
		
		driver.switchTo().frame("frame1");
		WebElement text = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println("Frame1 text="+text.getText());
		
		WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childframe);
		
		WebElement text1 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		System.out.println("Frame2 Text1="+text1.getText());
		Thread.sleep(500);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}

}
