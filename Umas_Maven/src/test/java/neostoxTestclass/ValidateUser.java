package neostoxTestclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseNeoProp;
import neoStoxPOMProp.HomePage;
import neoStoxPOMProp.PassCodePage;
import neoStoxPOMProp.SignInPage;
import utility.Utility;
import utility.UtilityNeoProp;

public class ValidateUser extends BaseNeoProp
{
	SignInPage signin;
	PassCodePage passcode;
	HomePage home;
	
	@BeforeClass
	public void launchNeostox() throws InterruptedException, IOException
	{
		LaunchBrowser();
		signin=new SignInPage(driver);
		passcode=new PassCodePage(driver);
		home=new HomePage(driver);
	}
	@BeforeMethod
	public void SignIntoNeostox() throws EncryptedDocumentException, IOException, InterruptedException
	{
		signin.enterMobNo(driver,UtilityNeoProp.readdatafromPropfile("mobno"));
		signin.clickSignin(driver);
		Utility.wait(driver,1000);
		passcode.enterpasscode(driver,UtilityNeoProp.readdatafromPropfile("password"));
		Thread.sleep(1000);
		passcode.clicksubmit(driver);
		Thread.sleep(1000);
		home.popup(driver);
		Thread.sleep(1000);
	}
//Single TC	
	@Test
	public void Validation() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Utility.takescreenshot(driver, home.validateuser(driver));
		Assert.assertEquals(home.validateuser(driver),UtilityNeoProp.readdatafromPropfile("username"),"TC failed actual and expected is not matching");
		
		Utility.takescreenshot(driver, home.validateBal(driver));
		Assert.assertEquals(home.validateBal(driver),UtilityNeoProp.readdatafromPropfile("acbalance"),"TC failed actual and expected is not matching");
		Thread.sleep(1000);
	}
//Multiple TC
//	@Test
//	public void validateusername() throws IOException, InterruptedException
//	{
//		Utility.takescreenshot(driver, home.validateuser(driver));
//		Assert.assertEquals(home.validateuser(driver),Utility.ExcelRead(1,2),"TC failed actual and expected is not matching");	
//		Thread.sleep(1000);
//	}
//	@Test(priority=1)
//	public void validateAcBal() throws IOException, InterruptedException
//	{
//		Assert.assertEquals(home.validateBal(driver),Utility.ExcelRead(1,3),"TC failed actual and expected is not matching");
//		Utility.takescreenshot(driver, home.validateBal(driver));
//		Thread.sleep(2000);
//	}
	
	@AfterMethod
	public void LogoutFromNeostox()
	{
		home.logout(driver);
	}
	
	@AfterClass
	public void ClosetheBrowser()
	{
		Reporter.log("Closing the Browser", true);
		driver.close();
	}

}
