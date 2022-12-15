package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class EdgeOptionsClass 
{
	public static void main(String[] args) 
	{
		EdgeOptions ed = new EdgeOptions();
		ed.addArguments("--disable-infobars");
		
		DesiredCapabilities dc = new DesiredCapabilities();
	    dc.setCapability(EdgeOptions.CAPABILITY, ed);
	    
		System.setProperty("webdriver.edge.driver", "D:\\SELENIUM\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
	
		driver.get("https://www.ajio.com/");
		
		

	}

}
