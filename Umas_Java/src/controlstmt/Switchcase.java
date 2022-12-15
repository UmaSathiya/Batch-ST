package controlstmt;

public class Switchcase {

	public static void main(String[] args) {
		// to check size
		int size=38;
		switch(size)
		{
		case 32:
			System.out.println("Size is Small");
			break;
		case 34:
			System.out.println("Size is Medium");
			break;
		case 36:
			System.out.println("Size is Large");
			break;
		case 38:
			System.out.println("Size is Xtra Large");
			break;
		case 40:
			System.out.println("Size is Double Xtra Large");
			break;
		default:
			System.out.println("Size is Unknown");
			break;
		}
		}
	}


