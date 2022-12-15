package upstoxPOMXcelread;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage
{
@FindBy(xpath="//div[text()='No, I’m good']")private WebElement NoIamGudButton;
	
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickNoImGudButton()
	{
		NoIamGudButton.click();
	}
}
