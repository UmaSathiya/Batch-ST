package exception;

public class ArithmeticException
{
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		int c=0;
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		try
		{
			c=a/b;
		}
		catch(java.lang.ArithmeticException e)
		{
			System.out.println("We cant divide by 0,check b value");
		}
		System.out.println(c);

	}

}
