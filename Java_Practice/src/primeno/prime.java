package primeno;

public class prime 
{
	 static public void main(String[] args)
	{
		int a=45;
		
		int rem=0;
		
		for(int b=1;b<=a;b++)
		{
			if(a%b==0)
			{
				rem++;
			}
		}
			if(rem==2)
			{
				System.out.println("Prime no");
			}
			else
			{
				System.out.println("Its not prime number");
			}
	}
}


