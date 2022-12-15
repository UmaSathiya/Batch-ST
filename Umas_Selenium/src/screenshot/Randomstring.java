package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Randomstring 
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 
		System.out.println(ss);
		 
		String a=RandomString.make(2);
				 
		File desti = new File("D:\\SELENIUM\\Selenium Materials\\screenshot\\"+a+".jpg");

		FileHandler.copy(ss, desti);
	}

}
