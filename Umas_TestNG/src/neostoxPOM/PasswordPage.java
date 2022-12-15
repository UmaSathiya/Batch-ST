package neostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage 
{
	@FindBy(id="txt_accesspin")private WebElement passcode;
	@FindBy(id="lnk_submitaccesspin")private WebElement submit;
	
	public PasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterpasscode()
	{
		passcode.sendKeys("1012");
	}
	public void clicksubmit()
	{
		submit.click();
	}
}
