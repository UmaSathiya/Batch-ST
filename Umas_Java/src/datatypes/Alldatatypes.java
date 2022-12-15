package datatypes;

public class Alldatatypes {
	//Primitive and Non-primitive datatypes
	
	public static void main(String[] args)	{
		// Variable declaration
		//here string,char,int,float are datatypes
		//here name,gender,height,weight,degree are variables
		
		String name;			//Non-primitive datatype
		char gender;			//Primitive--character
		int height;				//Primitive--Numeric+nondecimal
		float weight;			//Primitive--Numeric+decimal
		String Degree;			//Non-primitive
		
		//Assign value to variables
		name="UMA MAHESWARI.R";
		gender='F';
		height=155;
		weight=55.6f;
		Degree="B.E(ECE)";
		
		//Usage
		System.out.println("My Name is "+name);
		System.out.println("My Gender is "+gender);
		System.out.println("My Height is "+height+"cm");
		System.out.println("My Weight is "+weight+"kg");
		System.out.println("My Degree is "+Degree);
		
	}
	

}
