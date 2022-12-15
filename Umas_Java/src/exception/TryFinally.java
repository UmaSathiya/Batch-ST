package exception;

public class TryFinally 
{
	public static void main(String[] args) 
	{
		String a="maharashtra";
		
		try
		{
			System.out.println(a.charAt(5));
		}
		finally
		{
			System.out.println("hi");
		}
	}
}
