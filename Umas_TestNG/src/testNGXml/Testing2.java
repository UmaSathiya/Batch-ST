package testNGXml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing2
{
  @Test
  public void F()
  {
	  Reporter.log("F is running",true);
  }
  @Test
  public void H()
  {
	  Reporter.log("H is running", true);
  }
  @Test
  public void E()
  {
	  Reporter.log("E is running", true);
  }
  @Test
  public void G()
  {
	  Reporter.log("G is running", true);
  }
}
