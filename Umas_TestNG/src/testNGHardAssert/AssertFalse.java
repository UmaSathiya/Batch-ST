package testNGHardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse
{
  @Test
  public void t1() 
  {
	  boolean a=false;
	  boolean b=true;
	  
	  Assert.assertFalse(a);
	  Assert.assertFalse(b,"b is true TC failed");
  }
}
