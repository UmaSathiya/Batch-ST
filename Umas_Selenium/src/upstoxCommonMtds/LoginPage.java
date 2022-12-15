package upstoxCommonMtds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
//	variable declaration(globally)--> no of elements = no of variable
	
//	1. Data member should be declared globally with access level private using @findBy Annotation
		
		@FindBy(name="userId")private WebElement Userid;
		@FindBy(name="password") private WebElement password;
		@FindBy(id="submit-btn")private WebElement signinButton;
		
//	2. Initialize within a constructor with access level public using pagefactory 	
		
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
//	3.Utilize within a method with access level public
		
		public void enterUserId(String un)
		{
			Userid.sendKeys(un);
		}
		public void enterpassword(String pword)
		{
			password.sendKeys(pword);
		}
		public void clickSigninButton()
		{
			signinButton.click();
		}
		
		
}
