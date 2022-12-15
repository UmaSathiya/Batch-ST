package policyBazaarPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.CommonUsedMethods;

public class HomePage 
{
	@FindBy(xpath="//div[@class='headfilters']")private WebElement userinfo;
	@FindBy(xpath="//a[@rel='logo']")private WebElement logo;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void Userinfo()
	{
		System.out.println(userinfo.getText());
	}
	public void sslogo(WebDriver driver) throws IOException
	{
		String lo=logo.getText();
		CommonUsedMethods.Takescreenshot(driver,lo);
	}

}
