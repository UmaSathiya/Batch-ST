package testNGHardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue 
{
  @Test
  public void testng()
  {
	  boolean a=true;
	   
	  Assert.assertTrue(a,"a not true TC Failed");
  }
  @Test
  public void t1()
  {
	  boolean b=false;
	  
	  Assert.assertTrue(b,"b false TC passed");
  }
}
