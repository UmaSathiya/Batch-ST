package chromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsClass 
{
	public static void main(String[] args) 
	{
		ChromeOptions op = new ChromeOptions();
		//op.addArguments("--disable-notifications");
		//op.addArguments("incognito");
		//op.addArguments("start-maximized");
		//op.addArguments("--disable-infobars");
		//op.addArguments("disable-popup-blocking");
		op.addArguments("--headless");
		
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(op);
		driver.get("https://www.ajio.com/");
		
		WebElement text = driver.findElement(By.xpath("//a[@title='MEN']"));
		System.out.println(text.getText());
	}

}
