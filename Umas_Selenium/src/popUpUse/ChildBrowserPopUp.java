package popUpUse;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
//		getWindowHandle method is used to get the id of main page and the return type will be string
		
		String mainpageId = driver.getWindowHandle();
		System.out.println(mainpageId);
		
		driver.findElement(By.name("NewWindow")).click();
		
//		getWindowHandles() is used to get the id of All pages ant the return type will Set of strings
		
		Set<String> AllpageId = driver.getWindowHandles();
		System.out.println(AllpageId);
		
		Iterator<String> id = AllpageId.iterator();	//get the id of single page
		String mainId = id.next();					//main page id
		String childId = id.next();					//child page Id
		
		driver.switchTo().window(childId);			//by using child id we can switch selenium focus to child browser
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Selenium'])[1]")).click();
		
		driver.switchTo().window(mainId);		//using main page id switch selenium focus to main page
		
		driver.findElement(By.name("home")).click();
	}
}
