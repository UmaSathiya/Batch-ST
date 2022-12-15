package testNGgrouping;

import org.testng.annotations.Test;

public class PG 
{
  @Test(groups = "grp")
  public void Pg1styear()
  {
	  System.out.println("PG 1st year");
  }
  @Test(groups = "grp1")
  public void Pg2ndyear()
  {
	  System.out.println("PG 2nd year");
  }
}
