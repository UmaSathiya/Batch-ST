package finalkeyword;

public final class Final 	//if any class declared as final then v cant extend that class 
{

	public static void main(String[] args) 
	{
		final int a=10;	
		System.out.println("a value is "+a);
		
		//a++;			//we cant reinitialise 'a' variable bcoz its declared as final
		
		Final f=new Final();
		f.test();
		
	}
	
	public final void test()	//if any method declared as final then v cant override that 
	{							//method in any sub class
		int b=20;
		System.out.println("b value is "+b);
	}
}
