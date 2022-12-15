package assignments;

public class Pune_university {

	public static void main(String[] args) 
	{
		// Nonstatic method syntax
		//classname objectname=new classname();		//to create object
		//objectname.methodname();					//to call nonstatic method
		
		Pune_university info=new Pune_university();	//object created for Nonstatic from same class
		info.studentinfo();							//calling Nonstatic from same class
		
		studentinfo1();								//Static from same class//methodname();
		
		Staticdiff.studentinfo2();					//Static from diff class//classname.methodname();
		
		Nonstaticdiff info1=new Nonstaticdiff();	//object created for Nonstatic from diff class
		info1.studentinfo3();						//calling Nonstatic from diff class
		
	}
	public void studentinfo()
	{
		String Name="UMA";
		char Gender='F';
		float Age=28.6f;
		String Degree="B.E(ECE)";
		
		System.out.println("My Name is "+Name);
		System.out.println("My Gender is "+Gender);
		System.out.println("My Age is "+Age);
		System.out.println("My Degree is "+Degree);
		
	}
	public static void studentinfo1()
	{
		String Name="ADVIK";
		char Gender='M';
		float Age=25.4f; 
		String Degree="B.E(ECE)";
		
		System.out.println("My Name is "+Name);
		System.out.println("My Gender is "+Gender);
		System.out.println("My Age is "+Age);
		System.out.println("My Degree is "+Degree);
		
	}

}

