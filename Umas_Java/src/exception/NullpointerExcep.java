package exception;

public class NullpointerExcep
{
	public static void main(String[] args)
	{
		String a="pune";
		String b=null;
		
		try
		{
		//	System.out.println(a.charAt(5));	//stringindexoutofbound
			System.out.println(a.concat(b));	//nullpointerexception
		//	System.out.println();
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("check string size");
		}
		catch(NullPointerException e)
		{
			System.out.println("String should not be null");
		}
		

	}

}
