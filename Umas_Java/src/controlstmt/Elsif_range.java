package controlstmt;

public class Elsif_range {

	public static void main(String[] args) {
		// if CGPA>=9---Grade A
		//else if CGPA<9 & CGPA>=8---Grade B
		//else if CGPA<8 & CGPA>=7---Grade C
		//else if CGPA<7 & CGPA>=6---Grade D
		//else Grade F
		
		float CGPA=8.6f;
		if(CGPA>=9)
		{
			System.out.println("Grade A");
		}
		else if(CGPA<9 & CGPA>=8)
		{
			System.out.println("Grade B");
		}
		else if(CGPA<8 & CGPA>=7)
		{
			System.out.println("Grade C");
		}
		else if(CGPA<7 & CGPA>=6)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Grade F--Fail");
		}
	}

}
