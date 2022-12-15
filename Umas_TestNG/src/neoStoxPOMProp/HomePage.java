package neoStoxPOMProp;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility.Utility;

public class HomePage 
{
	@FindBy(xpath="(//button[@class='close'])[19]//span")private WebElement cancel;
	@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement close; 
	@FindBy(id="lbl_username")private WebElement username;
	@FindBy(id="lbl_curbalancetop")private WebElement userbal;
	@FindBy(id="navbarDropdown")private WebElement dropdown;
	@FindBy(id="lnk_logout")private WebElement logout;

	  public HomePage(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }
	  public void popup(WebDriver driver)
	  {
		  Utility.wait(driver, 1000);
		  cancel.click();
		  Reporter.log("Clicking Cancel Button",true);
		  Utility.wait(driver, 1000);
		  close.click();
		  Reporter.log("Clicking Close Button",true);
	  }
	  public String validateuser(WebDriver driver) throws IOException
	  {
		  String Actusername=username.getText();
		  Reporter.log("Getting Actual username", true);
		  return Actusername;
	  }
	  public String validateBal(WebDriver driver) throws IOException
	  {
		  String ActuserBal=userbal.getText();
		  Reporter.log("Getting Actual userBalance", true);
		  return ActuserBal;
	  }
	  public void logout(WebDriver driver) throws InterruptedException
	  {
		  Utility.wait(driver,2000);
		  Thread.sleep(500);
		  dropdown.click();
		  Reporter.log("Clicking the Dropdown", true);
		  logout.click();
		  Reporter.log("Clicking logout",true);
	  }
}
