package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import commonMethods.CommonUsedMethods;

public class Scrolling 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.automationtestinginsider.com/");
		CommonUsedMethods.Implicitwait(driver, 10);
		
		Dimension defaultsize = driver.manage().window().getSize();
		System.out.println("defaultsize:"+defaultsize);
//	To Set the Size		
		Dimension d = new Dimension(800,600);
		driver.manage().window().setSize(d);
		
		Point defpos = driver.manage().window().getPosition();
		System.out.println("default position:"+defpos);
//	To Set the Position
		Point p = new Point(70, 40);
		driver.manage().window().setPosition(p);
		
//		Actions a = new Actions(driver);
//		a.scrollByAmount(300,1000);
//		WebElement view1 = driver.findElement(By.xpath("(//div[@itemprop='articleBody'])[4]"));
//		a.scrollToElement(view1);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(100,700)");
		
		WebElement view = driver.findElement(By.xpath("(//div[@itemprop='articleBody'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)",view);

	}

}
