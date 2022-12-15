package casting;

public class Implicit {

	public static void main(String[] args) 
	{
		//lower-->higher
		//memory size-->increasing
		//data loss-->no
		
		int a=142;
		System.out.println(a);
		
		long b=a;
		System.out.println(b);
		
		double c=a;
		System.out.println(c);
	}

}
