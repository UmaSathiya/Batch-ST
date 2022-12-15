package ebayPOMProp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility.UtilityEbayProp;

public class Signinpage 
{
	@FindBy(xpath="(//a[text()='Sign in'])[1]")private WebElement signin;
//	@FindBy(id="switch-account-anchor")private WebElement switchacc;
	@FindBy(id="userid")private WebElement email;
	@FindBy(id="signin-continue-btn")private WebElement continuebutton;
	
	public Signinpage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	public void clicksignin()
	{
		signin.click();
		Reporter.log("Clicking signin icon",true);
//		switchacc.click();
//		Reporter.log("Clicking Switch to account",true);
	}
	public void enterEmail(String emailid)
	{
		email.sendKeys(emailid);
		Reporter.log("Entering Email id",true);
	}
	public void clickcontinue(WebDriver driver)
	{
		continuebutton.click();
		Reporter.log("clicking continue button",true);
		UtilityEbayProp.wait(driver,1000);
	}

}
