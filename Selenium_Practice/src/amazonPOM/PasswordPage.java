package amazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage 
{
	@FindBy(id="ap_password")private WebElement password;
	@FindBy(id="signInSubmit")private WebElement signinbutton;
	
	public PasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterPassword()
	{
		password.sendKeys("maheseelan12");
	}
	public void clicksigninbutton()
	{
		signinbutton.click();
	}
}
