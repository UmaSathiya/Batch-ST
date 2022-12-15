package casting;

public class Explicit {

	public static void main(String[] args) 
	{
		//higher-->lower
		//memory size-->decreasing/narrowing
		//data loss-->yes
		
		double a=189.78653289d;
		System.out.println(a);
		
		int b=(int)a;
		System.out.println(b);
		
		float c=(float)a;
		System.out.println(c);
		
		short d=(short)a;
		System.out.println(d);
	}

}
