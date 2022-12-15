package scrolling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		//driver.manage().window().maximize();
		Dimension defaultsize = driver.manage().window().getSize();
		System.out.println(defaultsize);
		
		Dimension d = new Dimension(700,300);
		Thread.sleep(500);
		driver.manage().window().setSize(d);
		
		
	}

}
