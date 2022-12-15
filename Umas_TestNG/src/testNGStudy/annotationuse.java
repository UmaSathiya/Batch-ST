package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotationuse {
  @Test
  public void myTest() 
  {
	  Reporter.log("MyTest is Running",true);
  }
  @Test
  public void myTest1()
  {
	  Reporter.log("MyTest1 is Running",true);
  }
  @BeforeMethod
  public void beforemethod()
  {
	  Reporter.log("Beforemethod is running", true);
  }
  @AfterMethod
  public void aftermethod()
  {
	  Reporter.log("After method is running", true);
  }
  @AfterClass
  public void afterclass()
  {
	  Reporter.log("After class is running",true);
  }
 }
