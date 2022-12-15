package neoStoxPOMProp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility.UtilityNeoProp;


public class SignInPage
{
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement mobno;
	@FindBy(id="lnk_signup1")private WebElement signinbutton;
	
	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterMobNo(WebDriver driver,String Mobno) 
	{
		UtilityNeoProp.wait(driver, 1000);
		mobno.sendKeys(Mobno);
		Reporter.log("Entering Mobile number",true);
	}
	public void clickSignin(WebDriver driver) 
	{
		UtilityNeoProp.wait(driver, 1000);
		signinbutton.click();
		Reporter.log("Clicking Signin Button",true);
	}

}
