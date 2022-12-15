package neostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignPage 
{
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement mobno;
	@FindBy(id="lnk_signup1")private WebElement signinbutton;
	
	public SignPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterMobNo()
	{
		mobno.sendKeys("9655006739");
	}
	public void clickSignin() 
	{
		signinbutton.click();
	}
}
