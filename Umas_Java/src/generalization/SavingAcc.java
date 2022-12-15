package generalization;

public class SavingAcc implements Bankaccount
{
	@Override
	public void AccountNo()
	{
		System.out.println("Savings Account No");
	}

	@Override
	public void AccountName()
	{
		System.out.println("Savings Account Name");
	}

	@Override
	public void Address()
	{
		System.out.println("Savings Account Address");
	}
	public void Balance()
	{
		System.out.println("Savings Account Balance");
	}

}
