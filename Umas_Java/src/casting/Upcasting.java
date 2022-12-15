package casting;

public class Upcasting
{
	public static void main(String[] args) 
	{
		Father f=new Father();	//create object of father & calling father property
		f.bike();
		f.car();
		
		System.out.println("=============");
		
		Son s=new Son();	//create object of son & calling son property
		s.bike();
		s.car();
		s.degree();
		
		System.out.println("==========");
		
		Father fs=new Son();	//create object of son & giving reference of father
		fs.bike();
		fs.car();
		//f.degree(); 			Can't call bcoz its not common in both father and son
	}
}
