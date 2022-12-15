package testNGHardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull 
{
  @Test
  public void testng() 
  {
	  String a=null;
//	  String a="Hello";
	  
	  Assert.assertNull(a,"a not null TC failed");
  }
}
