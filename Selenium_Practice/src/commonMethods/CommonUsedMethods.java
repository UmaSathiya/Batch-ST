package commonMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonUsedMethods 
{
//TakeScreenShot	
	public static void Takescreenshot(WebDriver driver,String Name) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\SELENIUM\\SELENIUM MATERIALS\\screenshot\\"+Name+".jpg");
		FileHandler.copy(src, dest);
	}
	
//ScrollIntoView
	public static void ScrollIntoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
//ImplicitWait	
	public static void Implicitwait(WebDriver driver,int a)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	}

}
