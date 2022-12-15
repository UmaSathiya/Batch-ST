package assignments;

import accesspecifiers.Demo;

public class Accessspec extends Demo
	{

	public static void main(String[] args)
	{
		Demo d=new Demo();
		Accessspec as=new Accessspec();
		//d.test1();
		//d.test2();
		as.test3();
		d.test4();
		
		//System.out.println("Private variable "+d.a);
		//System.out.println("Default variable "+d.b);
		System.out.println("Protected variable "+as.c);
		System.out.println("Public variable "+d.d);
		

	}

}
