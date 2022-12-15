package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement Username;
	@FindBy(id="funds")private WebElement funds;
	@FindBy(id="logout")private WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ValidateUsername()
	{
		 String actualUsername = Username.getText();
		 String ExpectedUsername = "Raju M.";
		 if(actualUsername.equals(ExpectedUsername))
		 {
			 System.out.println("Username Matching TC passed");
		 }
		 else
		 {
			 System.out.println("Username not Matching TC failed");
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
