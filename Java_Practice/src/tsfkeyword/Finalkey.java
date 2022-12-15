package tsfkeyword;

public final class Finalkey 	//we can't extends this class
{
	public static void main(String[] args) 
	{
		final int x=25;
		System.out.println("Final variable:"+x);
		
		//x++;	we can't re-initialize the variable which is declared final
		
		Finalkey final1=new Finalkey();
		final1.test1();
	}
	
	
	public final void test1()		//we can't override this method
	{
		System.out.println("Method declared Final");
	}
}
