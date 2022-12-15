package popUpUse;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(500);
//		Switch selenium focus from main page to alert popup because alert pop up dont have inspect
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();	//click ok on alert pop up message
		
		WebElement text = driver.findElement(By.xpath("//div[text()='Alerts']"));
		System.out.println(text.getText());
	}

}
