package utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility 
{
	//Commonly Used Methods
	//Wait-Screenshot-Scrolling-Excel reading
	
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
	
	public static String ExcelRead(int row,int cell) throws EncryptedDocumentException, IOException
	{
		//wait(driver,500);
		File file = new File("D:\\SELENIUM\\Xcel.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Sheet5").getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("Reading Excel file",true);
		return value;
	}
	
	public static void wait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		Reporter.log("Wait for"+time+"ms", true);
	}

}
