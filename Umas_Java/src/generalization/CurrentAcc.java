package generalization;

public class CurrentAcc implements Bankaccount
{
	@Override
	public void AccountNo()
	{
		System.out.println("Current Account No");
	}

	@Override
	public void AccountName()
	{
		System.out.println("Current Account Name");		
	}

	@Override
	public void Address()
	{
		System.out.println("Current Account Address");
	}
	public void Minbalance()
	{
		System.out.println("Current Account MInbalance");
	}
}
