package collectionList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingsearchList 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		driver.get("https://www.bing.com/");
		driver.findElement(By.name("q")).sendKeys("Testing");
		Thread.sleep(500);
		
		System.out.println("==============search list===============");
		
//		List<WebElement> l = driver.findElements(By.id("sa_ul"));
//		By using Id v cant perform click action & also cant get the size
//		So for that we go with the Xpath to findelements list
		
		List<WebElement> l = driver.findElements(By.xpath("//ul[@id='sa_ul']/li"));
		for(WebElement l1:l)
		{
			System.out.println(l1.getText());
			String exp="testing life cycle";
			String act=l1.getText();
			if(act.equals(exp))
			{
				l1.click();
				break;		//after the click action it wont move further so it will print upto that click action
			}
		}
		System.out.println("size:"+l.size());// by using id we cant get exact size

	}

}
