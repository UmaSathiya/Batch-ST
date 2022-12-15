package primenoloop;

public class Forloop 
{
	public static void main(String[] args)
	{
		//To print the Prime no by using for loop
		//no/1 and no/no is called prime
		
		int c;
		System.out.println("Print Prime No's from 1 to 20");
		for(int a=2;a<=20;a++)		
		{
			c=0;
			for(int b=1;b<=a;b++)
			{
				if(a%b==0)
				{
					c++;
				}
			}
			if(c==2)
			{
			System.out.println(a);
			}
		}
	}
}
