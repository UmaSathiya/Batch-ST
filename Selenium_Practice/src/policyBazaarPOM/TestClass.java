package policyBazaarPOM;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		
		File file = new File("D:\\SELENIUM\\Xcel.xlsx");
		Sheet mysheet = WorkbookFactory.create(file).getSheet("Sheet5");
		
		WelcomePage wel=new WelcomePage(driver);
		wel.clickTermLife();
		Thread.sleep(1000);
		
		UserInfoPage user=new UserInfoPage(driver);
		user.selectgender();
		user.enterName(mysheet.getRow(0).getCell(0).getStringCellValue());
		user.enterdob(mysheet.getRow(0).getCell(1).getStringCellValue());
		user.entermobile(mysheet.getRow(0).getCell(2).getStringCellValue());
		user.clicksubmit();
		Thread.sleep(1000);
		
//		HomePage home=new HomePage(driver);
//		home.Userinfo();
//		home.sslogo(driver);

	}

}
