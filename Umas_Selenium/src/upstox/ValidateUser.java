package upstox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUser 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		
		driver.findElement(By.name("userId")).sendKeys("6VBYZY");
		driver.findElement(By.name("password")).sendKeys("Seelan#12");
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("yob")).sendKeys("1989");
		Thread.sleep(7000);
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
