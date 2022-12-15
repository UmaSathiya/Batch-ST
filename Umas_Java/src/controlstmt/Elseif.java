package controlstmt;

public class Elseif {

	public static void main(String[] args) {
		// if percentage>=70--Distinction
		// elseif percentage>=60--first class
		// elseif percentage>=50--second class
		// else--fail--default
		float percentage=81.5f;
		if(percentage>=70)
		{
			System.out.println("Distinction");
		}
		else if(percentage>=60)
		{
			System.out.println("First class");
		}
		else if(percentage>=50)
		{
			System.out.println("Second class");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
