package assignments;

public class Switchcase {

	public static void main(String[] args) {
		char grade='D';
		
		switch(grade)
		{
		case 'A':
			System.out.println("Distiction");
			break;
			
		case 'B':
			System.out.println("First class");
			break;
		case 'C':
			System.out.println("Second class");
			break;
		default:
			System.out.println("Fail");
			break;
		}

	}

}
