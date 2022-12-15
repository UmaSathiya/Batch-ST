package controlstmt;

public class Ifelse
{
	public static void main(String[] args) 
	{
		int attendence=65;
		char medicalissue='Y';
		
		if(attendence>=75)
		{
			System.out.println("Eligible to Write Exam");
		}
		else if(attendence<75 && medicalissue=='Y')
		{
			System.out.println("Submit Medical report");
			System.out.println("Allowed for Exam");
		}
		else
		{
			System.out.println("Not allowed");
		}
		
		String day="Wednesday";
		
		System.out.println("============================");
		if(day=="Monday")
		{
			
			System.out.println("Its Monday");
			System.out.println("Morning Exam");
			System.out.println("EVS subject");
		}
		else if(day=="Wednesday")
		{
			System.out.println("Its Wednesday");
			System.out.println("Afternoon Exam");
			System.out.println("Maths subject");
		}
		else
		{
			System.out.println("Its Weekend");
			System.out.println("No Exam");
			System.out.println("Prepare for next exam");
		}
	}

}
