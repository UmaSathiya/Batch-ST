package primenoloop;

public class Whileloop 
{
	public static void main(String[] args) 
	{
		int a,c;
		a=1;
		System.out.println("Print Prime No's from 1 to 10");
		while(a<=10)
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
			a++;
		}

	}

}
