package accesspecifier;

public class Aspecifier1 
{
	public static void main(String[] args)
	{
		Aspecifier as=new Aspecifier();
		//as.exam();		//private scope only within class 
		as.exam1();
		as.exam2();
		as.exam3();
		
		//System.out.println("Private variable:"+as.a);		//private scope only within class
		System.out.println("Default variable:"+as.b);
		System.out.println("Protected variable:"+as.name);
		System.out.println("Public variable:"+as.x);

	}

}
