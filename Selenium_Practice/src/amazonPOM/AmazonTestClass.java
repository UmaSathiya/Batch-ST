package amazonPOM;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		
		File f = new File("D:\\SELENIUM\\Xcel.xlsx");
		Sheet mysheet = WorkbookFactory.create(f).getSheet("Sheet3");
		
		WelcomePage wel=new WelcomePage(driver);
		wel.clickSignin();
		Thread.sleep(2000);		
		
		SigninPage sign=new SigninPage(driver);
		sign.enterMobileNo(mysheet.getRow(2).getCell(0).getStringCellValue());
		sign.clickContinue();
		Thread.sleep(2000);
		
		PasswordPage pass=new PasswordPage(driver);
		pass.enterPassword();
		pass.clicksigninbutton();
		Thread.sleep(2000);
		
		HomePage home=new HomePage(driver);
		home.validateUser(driver);
		home.clicktodaydeals();
//		home.clicklogout(driver);

	}

}
