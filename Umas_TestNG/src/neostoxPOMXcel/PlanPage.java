package neostoxPOMXcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlanPage 
{
	@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement close;
	
	public PlanPage(WebDriver driver)
	{
	  PageFactory.initElements(driver,this);
	}
	public void clickclose()
	{
	  close.click();
	}
}
