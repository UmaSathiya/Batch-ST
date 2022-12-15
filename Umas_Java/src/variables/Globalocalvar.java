package variables;

//Variables is a piece of memory used to store the information

public class Globalocalvar {
	int a=120;			//non static global variable
	static int b=40;	//static global variable
	
	public static void main(String[] args) 
	{
		//*******calling static variable from same class*****************//
		SvarSC();								
		System.out.println("Static global variable from same class "+b);
		int sum=30+b;
		System.out.println("static method from same class sum "+sum);
		
		//*******calling Nonstatic variable from same class************//
		Globalocalvar obj=new Globalocalvar();	//create object for same class
		obj.NSvarSC();							//calling nonstatic method from same class
		
		System.out.println("Nonstatic global variable from same class "+obj.a);
		int sub=150-obj.a;
		System.out.println("Nonstatic method from same class sub "+sub);
		
		//calling Non Static Global variables from diff class
		
		varDC obj1=new varDC();				//create object for diff class
		
		System.out.println("Nonstatic Global variable from diff class "+obj1.B);
		int mul=10*obj1.B;					
		System.out.println("Nonstatic Global variable from DC mul="+mul);
		
		//calling Static Global variables from diff class
		System.out.println("Static global variable from diff class "+varDC.A);
		int div=80/varDC.A;						
		System.out.println("Static Global variable from DC div="+div);
		
		}
	public static void SvarSC()			//static method from same class
	{
		int c=20;		//local variable
		int c1=2;
		int mul=c*c1;
		System.out.println("Static local variable from same class c*c1="+mul);
	}
	public void NSvarSC()				//Nonstatic method from same class
	{
		int d=10;	//local variable
		int d1=5;
		int div=d/d1;
		System.out.println("Nonstatic local variable from same class d/d1="+div);
	}

}
