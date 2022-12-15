package variables;

public class Varlocglob
{
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
	String i;
	
	static byte a1;
	static short b1;
	static int c1;
	static long d1;
	static float e1;
	static double f1;
	static char g1;
	static boolean h1;
	static String i1;

	public static void main(String[] args) 
	{
		Varlocglob v=new Varlocglob();
		
		System.out.println("Nonstatic Global variable default value");
		System.out.println("byte= "+v.a);
		System.out.println("short="+v.b);
		System.out.println("int="+v.c);
		System.out.println("long="+v.d);
		System.out.println("float="+v.e);
		System.out.println("double="+v.f);
		System.out.println("char="+v.g);
		System.out.println("boolean="+v.h);
		System.out.println("String="+v.i);
		
		System.out.println("=====================================");
		System.out.println("Static Global variable default value");
		System.out.println("byte="+a1);
		System.out.println("short="+b1);
		System.out.println("int="+c1);
		System.out.println("long="+d1);
		System.out.println("float="+e1);
		System.out.println("double="+f1);
		System.out.println("char="+g1);
		System.out.println("boolean="+h1);
		System.out.println("String="+i1);

	}
	
	/*public void variable()
	{
		byte a2;		//local variable do not have default value
		short b2;		//we must initialize the local variable before using it
		int c2;
		long d2;
		float e2;
		char f2;
		String g2;
		
		System.out.println("Local variable");
		System.out.println(a2);
		System.out.println(b2);
		System.out.println(c2);
		System.out.println(d2);
		System.out.println(e2);
		System.out.println(f2);
		System.out.println(g2);
		
	}*/

}
