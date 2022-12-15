package sCrolling;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
//	How to get default Position
		Point defaultPosition = driver.manage().window().getPosition();
		System.out.println(defaultPosition);
		
// To set position we need to create object for Point class and pass the values
		Point p = new Point(40,20);
		Thread.sleep(500);
		driver.manage().window().setPosition(p);
	}
}
