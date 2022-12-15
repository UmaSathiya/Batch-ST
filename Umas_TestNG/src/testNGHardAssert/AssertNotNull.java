package testNGHardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull 
{
  @Test
  public void testng()
  {
	 String a=null;
	 Assert.assertNotNull(a,"a is null TC failed");
  }
  @Test
  public void t1()
  {
	  String b="Hello"; 
	  Assert.assertNotNull(b,"b is not null TC passed");
	  
  }
}
