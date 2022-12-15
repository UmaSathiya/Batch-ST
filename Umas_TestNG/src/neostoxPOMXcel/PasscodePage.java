package neostoxPOMXcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasscodePage 
{
	@FindBy(id="txt_accesspin")private WebElement passcode;
	@FindBy(id="lnk_submitaccesspin")private WebElement submit;
	
	public PasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterpasscode(String pass)
	{
		passcode.sendKeys(pass);
	}
	public void clicksubmit()
	{
		submit.click();
	}
}
