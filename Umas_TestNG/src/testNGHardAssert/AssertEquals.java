package testNGHardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals 
{
  @Test
  public void assertequals() 
  {
	  String a="Wagholi";
	  String b="Wagholi";
	  
	  Assert.assertEquals(a, b,"a and b not matching TC failed");
  }
}
