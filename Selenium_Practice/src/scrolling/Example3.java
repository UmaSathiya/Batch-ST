package scrolling;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Point defaultposition = driver.manage().window().getPosition();
		System.out.println(defaultposition);
		
		Point p = new Point(30,50);
		driver.manage().window().setPosition(p);
	}
}
