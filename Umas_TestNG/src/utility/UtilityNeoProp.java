package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityNeoProp 
{
	public static String readdatafromPropfile(String key) throws IOException
	{
		Properties prop=new Properties();
	
		FileInputStream myfile=new FileInputStream("C:\\Users\\ADVIK\\eclipse-workspace\\Umas_TestNG\\neostox.properties");
	
		prop.load(myfile);
		
		String value=prop.getProperty(key);
		Reporter.log("reading"+key+"from Properties file",true);
		
		return value;
	}
	public static void takescreenshot(WebDriver driver,String ssname) throws IOException
	{
		wait(driver,500);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\SELENIUM\\SELENIUM MATERIALS\\screenshot\\"+ssname+".jpg");
		
		FileHandler.copy(src, dest);
		Reporter.log("Taking Screenshot",true);
	}
	
	public static void scrolling(WebDriver driver,WebElement element)
	{
		wait(driver,500);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		Reporter.log("Scrolling to the element",true);
	}
	public static void wait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		Reporter.log("Wait for"+time+"ms", true);
	}
}
