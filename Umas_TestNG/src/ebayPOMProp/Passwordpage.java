package ebayPOMProp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility.UtilityEbayProp;

public class Passwordpage 
{
	@FindBy(id="pass")private WebElement password;
	@FindBy(id="sgnBt")private WebElement signin;
	
	public Passwordpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
		Reporter.log("Entering password",true);
	}
	public void clicksignin(WebDriver driver)
	{
		signin.click();
		Reporter.log("Clicking signin button",true);
		UtilityEbayProp.wait(driver,1000);
	}
}
