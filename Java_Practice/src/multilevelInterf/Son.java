package multilevelInterf;

public class Son implements Father
{
	public static void main(String[] args)
	{
		Son mul=new Son();
		mul.book();
		mul.mobile();
		mul.land();
		mul.home();
		mul.farm();
		mul.vehicle();
	}

	@Override
	public void land()
	{
		System.out.println("Fathers land");
	}

	@Override
	public void home() 
	{
		System.out.println("Fathers Home");
	}

	@Override
	public void farm() 
	{
		System.out.println("Grandfathers Farm");
	}

	@Override
	public void vehicle()
	{
		System.out.println("Grandfathers Vehicle");
	}

	public void mobile() 
	{
		System.out.println("Son Mobile");
	}

	public void book()
	{
		System.out.println("Son Book");
	}
}
