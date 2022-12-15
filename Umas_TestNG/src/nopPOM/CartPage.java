package nopPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CartPage 
{
	@FindBy(id="termsofservice")private WebElement checkbox;
	@FindBy(id="checkout")private WebElement checkout;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickcheckout()
	{
		checkbox.click();
		Reporter.log("Clicking checkbox", true);
		checkout.click();
		Reporter.log("Clicking checkout Button", true);
	}
}
