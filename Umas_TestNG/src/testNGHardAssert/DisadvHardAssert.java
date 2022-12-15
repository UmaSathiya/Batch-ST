package testNGHardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisadvHardAssert 
{
  @Test
  public void f1() 
  {
	  String a="Pune";
	  String b=null;
	  
//if both are not equal and b is not null then TC should be pass
	  
	  Assert.assertNotEquals(a, b, "a and b equal TC Failed");
	  Assert.assertNotNull(b,"b null TC Failed");
  }
}
