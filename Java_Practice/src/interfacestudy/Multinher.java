package interfacestudy;

public class Multinher implements Int1,Int2
{
	public static void main(String[] args)
	{
		Multinher mul=new Multinher();
		mul.cycle();
		mul.bike();
		mul.car();
		
		Int1.truck();
		Int2.truck();
	}

	@Override
	public void cycle()
	{
		Int1.super.cycle();
		Int2.super.cycle();
	}

	@Override
	public void bike() 
	{
		System.out.println("Int2 abstract method");
	}

	@Override
	public void car() 
	{
		System.out.println("Int1 abstract method");
	}

}
