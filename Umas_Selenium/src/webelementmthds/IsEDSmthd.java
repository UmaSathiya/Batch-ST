package webelementmthds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEDSmthd 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/login");
		
		driver.manage().window().maximize();
		
		//isEnabled Method
		System.out.println(driver.findElement(By.xpath("//button[text()='Sign In']")).isEnabled());
		
		//isSelected Method
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement radio2 = driver.findElement(By.xpath("(//input[@name='radio'])[2]"));
		System.out.println(radio2.isSelected());
		radio2.click();
		System.out.println(radio2.isSelected());
		
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		System.out.println(checkbox.isSelected());
		checkbox.click();
		System.out.println(checkbox.isSelected());
		
		//isDisplayed Method
		
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		textbox.sendKeys("Gud Morning");
		WebElement hidebox = driver.findElement(By.id("hide-textbox"));
		WebElement showbox = driver.findElement(By.id("show-textbox"));
		hidebox.click();
		showbox.click();
		System.out.println(textbox.isDisplayed());
		
//		if(textbox.isDisplayed())
//		{
//			textbox.sendKeys("Gudafternoon");
//		}
//		else
//		{
//			System.out.println("Textbox is not displayed");
//		}
	}

}
