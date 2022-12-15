package upstoxCommonMtds;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.CommonUsedMethods;

public class HPageCommonMtds 
{
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement Username;
	@FindBy(id="funds")private WebElement funds;
	@FindBy(id="logout")private WebElement logout;
	
	public HPageCommonMtds(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ValidateUser(String Expname,WebDriver driver) throws IOException
	{
		String actualName = Username.getText();
		
		CommonUsedMethods.ScrollIntoView(driver, Username);
		CommonUsedMethods.Takescreenshot(driver, actualName);
		
		if(actualName.equals(Expname))
		{
			System.out.println("Username matching TC passed");
		}
		else
		{
			System.out.println("Username not matching TC Failed");
		}
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
