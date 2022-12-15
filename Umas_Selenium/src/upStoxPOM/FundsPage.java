package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundsPage 
{
	@FindBy(xpath="((//div[@class='_2BBe9RdErXc7K8fvQxPEzj'])[1]//div)[4]")private WebElement trade;

	public FundsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void getfundvalue()
	{
		String fundvalue = trade.getText();
		System.out.println("Available to trade:"+fundvalue);
	}
}
