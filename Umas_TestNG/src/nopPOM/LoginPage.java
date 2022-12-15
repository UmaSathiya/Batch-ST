package nopPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage 
{
	@FindBy(id="Email")private WebElement email;
	@FindBy(id="Password")private WebElement pass;
	@FindBy(xpath="(//button[@type='submit'])[2]")private WebElement submit;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enteremail(String emailid)
	{
		email.sendKeys(emailid);
		Reporter.log("Entering email id",true);
	}
	public void enterpswd(String pawd)
	{
		pass.sendKeys(pawd);
		Reporter.log("Entering password",true);
	}
	public void clicksubmit()
	{
		submit.click();
		Reporter.log("Clicking submit button",true);
	}
	
}
