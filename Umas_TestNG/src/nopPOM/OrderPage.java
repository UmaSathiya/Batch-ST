package nopPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility.UtilityNopProp;

public class OrderPage 
{
	@FindBy(xpath="//a[text()='Click here for order details.']")private WebElement order;
	@FindBy(xpath="//a[text()='Log out']")private WebElement logout;
	@FindBy(xpath="(//div[@class='order-overview']//li)[3]//strong")private WebElement totalamt;
	
	public OrderPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	public void clickorder()
	{
		order.click();
		Reporter.log("Clicking Order details",true);
	}
	public String orderamount(WebDriver driver) throws IOException
	{
		String amount=totalamt.getText();
		Reporter.log("Getting Totalamount",true);
		System.out.println(amount);
		UtilityNopProp.wait(driver,1000);
		UtilityNopProp.takescreenshot(driver,amount);
		return amount;
	}
	public void clicklogout()
	{
		logout.click();
		Reporter.log("Clicking logout",true);
	}

}
