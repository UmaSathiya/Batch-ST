package amodifier;

import accesspecifier.Aspecifier;

public class Amodifier extends Aspecifier 
{
	public static void main(String[] args)
	{
		Aspecifier as=new Aspecifier();
		Amodifier am=new Amodifier();
		//as.exam();
		//as.exam1();
		am.exam2();
		as.exam3();
		
		//System.out.println("Private variable:"+as.a);
		//System.out.println("Default variable:"+as.b);
		System.out.println("Protected variable:"+am.name);
		System.out.println("Public variable:"+as.x);

	}

}
