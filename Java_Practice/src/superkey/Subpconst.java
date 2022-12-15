package superkey;

public class Subpconst extends Suppconst
{	
	String Deg;
	public static void main(String[] args) 
	{
		Subpconst Sub=new Subpconst("B.E");
		Sub.test();		
	}
	public Subpconst(String degree)
	{
		super("Uma");
		Deg=degree;
		System.out.println("Degree:"+degree);
		System.out.println("Subclass Constructor with parameter");
	}
	public void test()
	{
		super.test();
		System.out.println("Subclass Method");
	}
}
