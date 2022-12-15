package methodconst;

public class dclass 
{
	public static void mul(int a,int b)
	{
		int mul=a*b;
		System.out.println("Static from diffclass mul:"+mul);
	}
	public void div(float a,float b)
	{
		float div=a/b;
		System.out.println("NS from difclass div:"+div);
	}
}
