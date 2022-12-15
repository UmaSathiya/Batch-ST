package popUpUse;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTab 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
		driver.findElement(By.linkText("Start Selenium Practice")).click();
		
		String mainId = driver.getWindowHandle();
		System.out.println(mainId);
		
		Set<String> allid = driver.getWindowHandles();
		System.out.println(allid);
		
		Iterator<String> id = allid.iterator();
		String mtabid = id.next();
		String ntabid = id.next();
		
		driver.switchTo().window(ntabid);
		
		driver.findElement(By.id("opentab")).click();
		Thread.sleep(1000);
		driver.close();
		
		driver.switchTo().window(mtabid);
		

	}

}
