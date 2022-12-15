package testNGSoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse 
{
	SoftAssert soft=new SoftAssert();
  @Test
  public void testng() 
  {
	  String a="Pune";
	  String b=null;
	  
	  soft.assertNotEquals(a, b,"a and b equal TC Failed");
	  soft.assertNull(b,"b not null TC Failed");
	  soft.assertAll();
  }
  @Test
  public void t1()
  {
	  soft.fail();
	  soft.assertAll();
  }
}
