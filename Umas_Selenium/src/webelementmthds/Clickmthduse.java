package webelementmthds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickmthduse
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw4c-ZBhAEEiwAZ105Rd5eysqHGqHJvx7kLvegvkzCEriMOjdfzSaBaeH56ayL0r1v9E8SbRoC8GIQAvD_BwE");
		
		driver.manage().window().maximize();
		
//		By Xpath locator type
		
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Already')]")).click();
		
		}

}
