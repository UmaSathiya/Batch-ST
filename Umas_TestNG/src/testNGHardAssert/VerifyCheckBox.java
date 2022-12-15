package testNGHardAssert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyCheckBox 
{
  @Test
  public void testng() 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
		
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
//	  if(checkbox.isSelected())
//	  {
//		  Reporter.log("Checkbox selected TC passed",true);
//	  }
//	  else
//	  {
//		  Reporter.log("Checkbox not selected TC failed",true);
//	  }
	  checkbox.click();
	  Assert.assertTrue(checkbox.isSelected(),"checkbox not selected TC failed");
  }
}
