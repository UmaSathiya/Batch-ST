package upstoxPOMXcelread;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasscodePage 
{
@FindBy(name="yob")private WebElement Birthyear;
	
	public PasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterPasscode(String pcode)
	{
		Birthyear.sendKeys(pcode);
	}
}
