package nopPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DataPage 
{
	@FindBy(id="add-to-cart-button-4")private WebElement cart;
	@FindBy(xpath="((//div[@class='header']//div)[5]//li)[4]")private WebElement shopcart;
	
	public DataPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickcart()
	{
		cart.click();
		Reporter.log("Clicking Add to cart Button", true);
	}
	public void clickshopcart()
	{
		shopcart.click();
		Reporter.log("Clicking shoppingcart Button", true);
	}

}
