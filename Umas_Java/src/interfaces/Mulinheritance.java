package interfaces;

public class Mulinheritance implements Intmul2
{
	public static void main(String[] args)
	{
		Mulinheritance mul=new Mulinheritance();
		mul.ex1();
		mul.ex2();
		mul.ex3();
		mul.ex4();
	}

	@Override
	public void ex3()
	{
		System.out.println("ex3 definition completed");
	}

	@Override
	public void ex4()
	{
		System.out.println("ex4 definition completed");
	}

	@Override
	public void ex1()
	{
		System.out.println("ex1 definition completed");
	}

	@Override
	public void ex2() 
	{
		System.out.println("ex2 definition completed");
	}

}
