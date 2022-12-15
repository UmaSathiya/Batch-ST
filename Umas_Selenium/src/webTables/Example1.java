package webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Need to pick all the rows and columns data by using for loop without header

public class Example1 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		for(int i=2;i<=11;i++)		//need to pickup rows(2 to 11)
		{
			for(int j=1;j<=3;j++)	//need to pickup column in a specific row(1 to 3)
			{
				String text = driver.findElement(By.xpath("(//table[@id='product'])//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text+" | ");
			}
			System.out.println();
		}

	}

}
