package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//			Facebook Signup page assignment

public class dropdown 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u')]")).click();
		Thread.sleep(500);
		driver.findElement(By.name("firstname")).sendKeys("Uma");
		Thread.sleep(500);
		driver.findElement(By.name("lastname")).sendKeys("Sathiya");
		Thread.sleep(500);
		driver.findElement(By.name("reg_email__")).sendKeys("9627283767");
		Thread.sleep(500);
		driver.findElement(By.name("reg_passwd__")).sendKeys("xyz102");
		
//		====================================================================================
//		Day selection in dropdown
		
		Thread.sleep(500);
		WebElement day = driver.findElement(By.id("day"));		//store in ref variable
		Select day1=new  Select(day);							//create object of selectclass 
		day1.selectByIndex(11);						//select day by using selectByindex() method
		
//		=====================================================================================
//		Month selection in dropdown
		
		Thread.sleep(500);
		WebElement month = driver.findElement(By.id("month"));  //Store in ref variable
		Select Month=new Select(month);			//create object of select class
		Month.selectByVisibleText("May");		//select month by using selectByVisibleText() method

//		=======================================================================================
//		Year selection in dropdown
		
		Thread.sleep(500);
		WebElement year = driver.findElement(By.id("year"));	//Store in Ref variable
		Select Year=new Select(year);				//Create object of selectclass for Year
		Year.selectByValue("1995");		//select year by using selectByValue() Method

//		=======================================================================================
//		Gender selection in radiobutton
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		
//		driver.findElement(By.name("websubmit")).click();
	}
}
