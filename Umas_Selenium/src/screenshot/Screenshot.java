package screenshot;

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
		
		driver.get("https://facebook.com/");
		
		File sshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File location = new File("D:\\SELENIUM\\Selenium Materials\\screenshot\\1.jpg");
		
		FileHandler.copy(sshot, location);
		

	}

	


}
