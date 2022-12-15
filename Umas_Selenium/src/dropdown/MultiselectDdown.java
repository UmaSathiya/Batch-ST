package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDdown
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement multiselect = driver.findElement(By.id("cars"));
		
		Select slot=new Select(multiselect);
		
		System.out.println("Multiselect Dropdown-"+slot.isMultiple());
		
		slot.selectByIndex(2);
		Thread.sleep(500);
		slot.selectByValue("volvo");
		Thread.sleep(500);
		slot.selectByVisibleText("Audi");
		Thread.sleep(500);
		
		//slot.deselectAll();
		slot.deselectByIndex(3);
		
		System.out.println(slot.getFirstSelectedOption().getText());
	}

}
