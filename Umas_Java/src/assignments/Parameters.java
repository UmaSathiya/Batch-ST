package assignments;

public class Parameters {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		studentdetails();		//calling Static method from Same class
		
		Parameters argu=new Parameters();						//Create object
		argu.studentdetails1("Advik",'M', 24.6f, "Electronics");	//Nonstatic Method from Sameclass
		argu.studentdetails1("Sathiya",'M', 28.9f,"Electronics");
		argu.studentdetails1("Seema",'F',27.4f,"Electronics");
	}
	
	public static void studentdetails()
	{
		String Name="UMA MAHESWARI.R";
		char Gender='F';
		float Age=30.3f;
		String Dept="Electronics";
		
		System.out.println("=======================");
		System.out.println("My Name is "+Name);
		System.out.println("My Gender is "+Gender);
		System.out.println("My Age is "+Age);
		System.out.println("My Dept is "+Dept);
		System.out.println("=======================");
		
	}
	public void studentdetails1(String Name,char Gender,float Age,String Dept)	//pass parameters into method
	{
			
		System.out.println("=======================");
		System.out.println("My Name is "+Name);
		System.out.println("My Gender is "+Gender);
		System.out.println("My Age is "+Age);
		System.out.println("My Dept is "+Dept);
		System.out.println("=======================");
		
	}
}
