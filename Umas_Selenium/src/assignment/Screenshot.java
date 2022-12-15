package assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(ss);
		File dest = new File("D:\\SELENIUM\\Selenium Materials\\screenshot\\a.jpg");
		FileHandler.copy(ss, dest);
	
	}

}
