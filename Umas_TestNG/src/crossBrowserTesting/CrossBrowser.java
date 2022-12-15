package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser 
{
	WebDriver driver;
	@Parameters("browserName")
	
  @Test
  public void browserTest(String Bname) 
  {
		if(Bname.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(Bname.equals("msedge"))
		{
			System.setProperty("webdriver.edge.driver","D:\\SELENIUM\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else if(Bname.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\SELENIUM\\geckodriver-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
  }
}
