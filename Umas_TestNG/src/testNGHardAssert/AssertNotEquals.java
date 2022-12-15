package testNGHardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals 
{
  @Test
  public void testng()
  {
	  String a="Advik16";
	  String b="advik1";
	  
	  Assert.assertNotEquals(a,b,"a and b same TC failed");
  }
}
