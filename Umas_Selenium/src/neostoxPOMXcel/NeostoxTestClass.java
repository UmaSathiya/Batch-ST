package neostoxPOMXcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeostoxTestClass
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.get("https://neostox.com/sign-in");
		
		File myfile = new File("D:\\SELENIUM\\Xcel.xlsx");
        Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet5");
		  
		SigninPage s1=new SigninPage(driver);
		s1.enterMobNo(mysheet.getRow(1).getCell(0).getStringCellValue());
		s1.clickSignin();
		Thread.sleep(1000);
		
		PasscodePage p1=new PasscodePage(driver);
		p1.enterpasscode(mysheet.getRow(1).getCell(1).getStringCellValue());
		p1.clicksubmit();
		Thread.sleep(1000);
		
		InstructPage i1=new InstructPage(driver);
		i1.clickcancel();
		Thread.sleep(1000);
		
		PlanPage p2=new PlanPage(driver);
		p2.clickclose();
		Thread.sleep(1000);
		
		HomePage h1=new HomePage(driver);
		h1.getActUserBal(driver);
		h1.getActUsername(driver);
		Thread.sleep(1000);
		
		h1.clickdropdown();
		h1.clicklogout();
		
		driver.close();

	}

}
