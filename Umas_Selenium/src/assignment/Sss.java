package assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Sss {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		File s1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(s1);
		
		File dest=new File("D:\\SELENIUM\\Selenium Materials\\screenshot\\1.jpg");	
		FileHandler.copy(s1, dest);;
		

	}

}
