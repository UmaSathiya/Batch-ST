package neoStoxPOMUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility.Utility;

public class PassCodePage 
{
	@FindBy(id="txt_accesspin")private WebElement passcode;
	@FindBy(id="lnk_submitaccesspin")private WebElement submit;
	
	public PassCodePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterpasscode(WebDriver driver,String pass)
	{
		Utility.wait(driver,1000);
		passcode.sendKeys(pass);
		Reporter.log("Entering Passcode",true);
	}
	public void clicksubmit(WebDriver driver)
	{
		Utility.wait(driver,1000);
		submit.click();
		Reporter.log("Clicking Submit Button",true);
	}

}
