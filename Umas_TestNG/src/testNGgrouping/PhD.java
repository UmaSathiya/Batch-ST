package testNGgrouping;

import org.testng.annotations.Test;

public class PhD 
{
  @Test(groups = "grp")
  public void Phd1styear() 
  {
	  System.out.println("PhD 1st year");
  }
}
