package mouseActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import commonMethods.CommonUsedMethods;

public class ScrollActions
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		CommonUsedMethods.Implicitwait(driver, 100);
		driver.get("https://vctcpune.com/selenium/practice.html");
		
//Create object for Actionsclass and scroll using scrollByAmount()		
		Actions act = new Actions(driver);
		act.scrollByAmount(0,250).perform();

//Scroll by using scrollIntoView() Commonused methods
		WebElement alert = driver.findElement(By.id("alertbtn"));
		CommonUsedMethods.ScrollIntoView(driver,alert);
	}
}
