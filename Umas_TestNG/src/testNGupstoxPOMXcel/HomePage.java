package testNGupstoxPOMXcel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.CommonUsedMethods;

public class HomePage 
{
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement Username;
	@FindBy(id="funds")private WebElement funds;
	@FindBy(id="logout")private WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public String getActualuserID(WebDriver driver) throws IOException
	{
		 String actualUsername = Username.getText();
		 CommonUsedMethods.Takescreenshot(driver, actualUsername);
		 return actualUsername;
	}
	public void clickfunds()
	{
		funds.click();
	}
	public void clicklogout() throws InterruptedException
	{
		Username.click();
		Thread.sleep(1000);
		logout.click();
	}
}
