package controlstmt;

public class Switchcase
{
	public static void main(String[] args) 
	{
		char grade='B';
		
		switch(grade)
		{
		case 'A':
			System.out.println("Distinction with 90%");
			break;
		case 'B':
			System.out.println("First class with 80%");
			break;
		case 'C':
			System.out.println("Second class with 70%");
			break;
		case 'D':
			System.out.println("Third class with 60%");
			break;
		case 'E':
			System.out.println("Pass with 50%");
			break;
		default:
			System.out.println("Fail");
			break;		
		}
	}
}
