package neostoxPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.CommonUsedMethods;

public class HomePage 
{
	@FindBy(id="lbl_username")private WebElement username;
	@FindBy(id="lbl_curbalancetop")private WebElement userbal;
	@FindBy(id="navbarDropdown")private WebElement dropdown;
	@FindBy(id="lnk_logout")private WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public String getActUsername(WebDriver driver) throws IOException
	{
		String actualUsername = username.getText();
		CommonUsedMethods.Takescreenshot(driver, actualUsername);
		return actualUsername;
	}
	public String getActUserBal(WebDriver driver) throws IOException
	{
		String actualUserBal = userbal.getText();
		CommonUsedMethods.Takescreenshot(driver, actualUserBal);
		return actualUserBal;
	}
	public void clickdropdown()
	{
		dropdown.click();
	}
	public void clicklogout()
	{
		logout.click();
	}
}
