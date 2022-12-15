package upstox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUserUsingXcel
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		
		File file=new File("D:\\SELENIUM\\Xcel.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet3");
		
		WebElement userid = driver.findElement(By.name("userId"));
		userid.sendKeys(sheet.getRow(0).getCell(0).getStringCellValue());
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		
		driver.findElement(By.id("submit-btn")).click();
		Thread.sleep(5000);
		WebElement passcode = driver.findElement(By.name("yob"));
		passcode.sendKeys(sheet.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		Thread.sleep(5000);
		String actualUN = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")).getText();
		String ExpectedUN = "Raju M.";
		if(actualUN.equals(ExpectedUN))
		{
			System.out.println("Username is Matching TC is passed");
		}
		else
		{
			System.out.println("Username is not Matching TC is Failed");
		}
		
		driver.findElement(By.id("funds")).click();
		Thread.sleep(5000);
		String funds = driver.findElement(By.xpath("((//div[@class='_2BBe9RdErXc7K8fvQxPEzj'])[1]//div)[4]")).getText();
		
		System.out.println("Fund Available to Trade is:"+funds);
	}

}
