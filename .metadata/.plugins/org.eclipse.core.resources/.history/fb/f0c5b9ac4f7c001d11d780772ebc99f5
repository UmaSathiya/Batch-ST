package ebayTestclass;

import org.testng.annotations.Test;
import base.BaseEbayProp;
import ebayPOMProp.Homepage;
import ebayPOMProp.Passwordpage;
import ebayPOMProp.Signinpage;
import utility.UtilityEbayProp;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

@Listeners(listener.Listener.class)

public class EbayTestclass extends BaseEbayProp
{
	Signinpage sign;
	Passwordpage password;
	Homepage home;
	
  @BeforeClass
  public void launchEbay() throws InterruptedException, IOException
  {
	  LaunchBrowser();
	  sign=new Signinpage(driver);
	  password=new Passwordpage(driver);
	  home=new Homepage(driver);
	  
  }
  @BeforeMethod
  public void beforeMethod() throws IOException, InterruptedException 
  {
	  sign.clicksignin();
	  UtilityEbayProp.wait(driver,1000);
//	  UtilityEbayProp.wait(driver,30000);
	  sign.enterEmail(UtilityEbayProp.readdatafromPropfile("email"));
	  sign.clickcontinue(driver);
	  UtilityEbayProp.wait(driver,2000);
	  Thread.sleep(500);
	  password.enterpassword(UtilityEbayProp.readdatafromPropfile("pass"));
	  password.clicksignin(driver);
	  UtilityEbayProp.wait(driver,2000);
	  Thread.sleep(500);
//	  home.clickcheckbox();
  }
  @Test
  public void validateuser() throws IOException, InterruptedException
  {
	 
	  UtilityEbayProp.takescreenshot(driver,home.validateusername(driver));
	  Assert.assertEquals(home.validateusername(driver),UtilityEbayProp.readdatafromPropfile("name"));
//	  Thread.sleep(500);
//  }
//  @Test(priority=1)
//  public void validateprice() throws IOException
//  {
	  home.senddataToSearchtab(driver);
	  
	  UtilityEbayProp.takescreenshot(driver,home.validateprice(driver));
	  Assert.assertEquals(home.validateprice(driver),UtilityEbayProp.readdatafromPropfile("price"));
  }
  @AfterMethod
  public void signoutfromEbay() 
  {
	  home.clicklogout(driver);
	  Reporter.log("Signout from Ebay",true);
  }
  @AfterClass
  public void closebrowser() 
  {
	  Reporter.log("Closing the browser",true);
	  driver.close();
  }

}
