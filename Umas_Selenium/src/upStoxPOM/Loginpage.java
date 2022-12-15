package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
//	variable declaration(globally)--> no of elements = no of variable
		
//	1. Data member should be declared globally with access level private using @findBy Annotation
		
		@FindBy(name="userId")private WebElement Userid;
		@FindBy(name="password") private WebElement password;
		@FindBy(id="submit-btn")private WebElement signinButton;
		
//	2. Initialize within a constructor with access level public using pagefactory 	
		
		public Loginpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
//	3.Utilize within a method with access level public
		
		public void enterUserId()
		{
			Userid.sendKeys("6VBYZY");
		}
		public void enterpassword()
		{
			password.sendKeys("Seelan#12");
		}
		public void clickSigninButton()
		{
			signinButton.click();
		}
}
