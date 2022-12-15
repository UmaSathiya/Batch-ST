package policyBazaarPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInfoPage 
{
	@FindBy(xpath="//span[text()=' Female']")private WebElement gender;
	@FindBy(id="nameAdd")private WebElement Name;
	@FindBy(id="dob")private WebElement Dob;
	@FindBy(id="mobileNo")private WebElement Mobile;
	@FindBy(id="submitButton")private WebElement Submit;
	
	public UserInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void selectgender()
	{
		gender.click();
	}
	public void enterName(String name)
	{
		Name.sendKeys(name);
	}
	public void enterdob(String date)
	{
		Dob.sendKeys(date);
	}
	public void entermobile(String mobileno)
	{
		Mobile.sendKeys(mobileno);
	}
	public void clicksubmit()
	{
		Submit.click();
	}
}
