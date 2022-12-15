package constructor;

public class Constparameter {
	int a;										//Global Variable
	int b;										//Global Variable
		
	public static void main(String[] args) 		//Main Method
	{
		Constparameter cc1=new Constparameter();//calling zero parameter constructor
		cc1.math();
		
		Constparameter cc2=new Constparameter(30);//calling 1 parameter constructor
		cc2.math();
		
		Constparameter cc3=new Constparameter(40,20);//calling 2 parameter constructor
		cc3.math();
	}
		

	public Constparameter()				  //Constructor with zero parameter
	{
		System.out.println("I am a zero parameter constructor");
		a=50;
		b=10;
	}
	public Constparameter(int c)			//Constructor with one parameter
	{
		System.out.println("I am a one parameter constructor ");
		a=c;
	}
	public Constparameter(int d,int e)		//Constructor with 2 parameter
	{
		System.out.println("I am a two parameter constructor");
		a=d;
		b=e;
	}
	public void math()
	{
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		System.out.println("a+b="+sum);
		System.out.println("a-b="+sub);
		System.out.println("a*b="+mul);
	}
}
