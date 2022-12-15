package generalization;

public class Accountdetails 
{
	public static void main(String[] args) 
	{
		SavingAcc s=new SavingAcc();
		s.AccountName();
		s.AccountNo();
		s.Address();
		s.Balance();
		
		System.out.println("==================");
		
		CurrentAcc c=new CurrentAcc();
		c.AccountName();
		c.AccountNo();
		c.Address();
		c.Minbalance();
	}
}
