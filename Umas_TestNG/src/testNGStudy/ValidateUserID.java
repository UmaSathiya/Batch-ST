package testNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ValidateUserID {
  @Test
  public void validateupstox()
  {
	  Reporter.log("User is validated",true);
  }
  @BeforeMethod
  public void loginintoUpstox() 
  {
	  Reporter.log("Login success..",true);
  }

  @AfterMethod
  public void logoutFromUpstox()
  {
	  Reporter.log("Logging Out" ,true);
  }

  @BeforeClass
  public void launchBrowser() 
  {
	  Reporter.log("Launching Browser",true);
  }

  @AfterClass
  public void CloseBrowser()
  {
	  Reporter.log("Closing Browser",true);
  }

}
