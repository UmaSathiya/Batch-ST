package policyBazaarPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	@FindBy(xpath="(//div[@class='prd-block'])[1]")private WebElement termlife;
	
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickTermLife()
	{
		termlife.click();
	}

}
