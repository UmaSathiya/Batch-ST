package amazonPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.CommonUsedMethods;

public class HomePage 
{
	@FindBy(xpath="//span[text()='Hello, Sathiya']")private WebElement username;
	@FindBy(xpath="(//div[@id='nav-xshop']//a)[3]")private WebElement deals;
//	@FindBy(xpath="//span[text()='Sign Out']")private WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void validateUser(WebDriver driver) throws IOException
	{
		String ActualUN=username.getText();
		CommonUsedMethods.Takescreenshot(driver,ActualUN );
		String ExpectedUN="Hello, Sathiya";
		if(ActualUN.equals(ExpectedUN))
		{
			System.out.println("UserName Matching TC passed");
		}
		else
		{
			System.out.println("Username not Matching TC Failed");
		}
	}
	public void clicktodaydeals() 
	{
		deals.click();
	}
//	public void clicklogout(WebDriver driver)
//	{
//		//CommonUsedMethods.ScrollIntoView(driver, logout);
//		logout.click();
//	}
}
