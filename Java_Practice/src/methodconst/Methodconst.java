package methodconst;

public class Methodconst 
{
	int x;
	int y;
	public static void main(String[] args)
	{
		add(10,20);				//Static from sameclass
		dclass.mul(10,10);		//Static from diffclass
		
		//Nonstatic method calling
		
		Methodconst m=new Methodconst();	//zero parameter constructor
		m.sub(25, 10);						//2 parameter method
		Methodconst m1=new Methodconst(10);	//1 parameter constructor
		m1.math();
		Methodconst m2=new Methodconst(20,10);	//2parameter Constructor
		m2.math();								
		
		dclass d=new dclass();			//Nonstatic from diffclass
		d.div(100f, 2.5f);				//2 parameter method
	}
	public Methodconst()
	{
		System.out.println("Zero parameter constructor");
	}
	public Methodconst(int a)
	{
		x=a;
		System.out.println("1 parameter constructor");
	}
	public Methodconst(int a,int b)
	{
		x=a;
		y=b;
		System.out.println("2 parameter constructor");
	}
	public void math()	//method without parameter
	{
		int add=x+y;
		//int mul=x*y;
		//int div=x/y;
		System.out.println("Add:"+add);
		//System.out.println("mul:"+mul);
		//System.out.println("Div:"+div);
	}
	public static void add(int a,int b)	//static method with parameter SC
	{
		int sum=a+b;
		System.out.println("Static from same class sum:"+sum);
	}
	public void sub(int c,int d)		//Nonstatic method with parameter SC 
	{
		int sub=c-d;
		System.out.println("Nonstatic from sameclass sub:"+sub);
	}
}
