package amazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage 
{
	@FindBy(id="ap_email")private WebElement mobile;
	@FindBy(id="continue")private WebElement continuebutton;
	
	public SigninPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterMobileNo(String mobileno)
	{
		mobile.sendKeys(mobileno);
	}
	public void clickContinue()
	{
		continuebutton.click();
	}
}
