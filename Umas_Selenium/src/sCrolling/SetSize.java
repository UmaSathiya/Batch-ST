package sCrolling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
//	How to get Default size		
		Dimension defaultSize = driver.manage().window().getSize();
		System.out.println(defaultSize);
		
//To set the size we need to create object for Dimension class and pass arguments x and y
		Dimension size = new Dimension(1200,252);
		driver.manage().window().setSize(size);
		Thread.sleep(500);
		Dimension size1 = new Dimension(900,500);
		driver.manage().window().setSize(size1);

	}

}
