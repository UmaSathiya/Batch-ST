package ebayPOMProp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility.UtilityEbayProp;

public class Homepage 
{
	@FindBy(id="gh-ug")private WebElement username;
	@FindBy(id="gh-ac")private WebElement searchbox;
	@FindBy(id="gh-btn")private WebElement searchbtn;
	@FindBy(id="checkbox")private WebElement checkbox;
	@FindBy(xpath="(//div[@id='srp-river-results']//li)[19]")private WebElement element;
	@FindBy(xpath="((//div[@id='srp-river-results']//li)[19]//div)[11]//span")private WebElement price1;
	@FindBy(xpath="//a[text()='Sign out']")private WebElement signout;
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickcheckbox()
	{
		checkbox.click();
	}
	public String validateusername(WebDriver driver)
	{
		String Actusername=username.getText(); 
		Reporter.log("Getting Actual username",true);
		System.out.println("Actual Username:"+Actusername);
		return Actusername;
	}
	public void senddataToSearchtab(WebDriver driver)
	{
		searchbox.click();
		searchbox.sendKeys("iphone 14");
		UtilityEbayProp.wait(driver,1000);
		Reporter.log("Sending iphone 14 to search", true);
		searchbtn.click();
		Reporter.log("Clicking search button",true);
		UtilityEbayProp.wait(driver,1000);
	}
	public String validateprice(WebDriver driver)
	{
		element.click();
//		UtilityEbayProp.wait(driver,1000);
		String Actualprice=price1.getText();
		Reporter.log("Getting Actual price",true);
		System.out.println("Actualprice:"+Actualprice);
		return Actualprice;
	}
	public void clicklogout(WebDriver driver)
	{
		username.click();
		UtilityEbayProp.wait(driver, 1000);
		signout.click();
	}
}
