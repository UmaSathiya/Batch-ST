package webelementmthds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextmthd 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Start Selenium Practice')]")).click();
		
		//1st way
		WebElement gettext = driver.findElement(By.xpath("//a[contains(text(),'Velocity')]"));
		System.out.println(gettext.getText());
	
		//2nd way
		
//		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Velocity')]")).getText());
	
		//3rd way
//		String myText=driver.findElement(By.xpath("//a[contains(text(),'Velocity')]")).getText();
//		System.out.println(myText);
		
		//driver.close();
		//driver.quit();
		
	}
		
}
