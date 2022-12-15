package webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//							Need to pickup rows including Header by using for loop

 public class Example2 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//need to pickup rows varying from 1 to 11
		
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==1)
				{
					 String data = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/th["+j+"]")).getText();
					 System.out.print(data+" | ");
				}
				else
				{
					 String data = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/td["+j+"]")).getText();
					 System.out.print(data+" | ");
				}
			}
			System.out.println();
		}

	}

}
