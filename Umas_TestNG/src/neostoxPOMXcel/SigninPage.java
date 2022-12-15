package neostoxPOMXcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage 
{
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement mobno;
	@FindBy(id="lnk_signup1")private WebElement signinbutton;
	
	public SigninPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterMobNo(String Mobno)
	{
		mobno.sendKeys(Mobno);
	}
	public void clickSignin() 
	{
		signinbutton.click();
	}
}
