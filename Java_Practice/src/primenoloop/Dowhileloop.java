package primenoloop;

public class Dowhileloop
{
	public static void main(String[] args)
	{
		int a=5;
		int c;
		System.out.println("Print Prime No's from 1 to 50");
		do
		{
			c=0;
			for(int b=1;b<=a;b++)	//1<=5	/2<=5	/3<=5	/4<=5	/5<=5
			{
				if(a%b==0)			//5%1=0	/5%2!=0	/5%3!=0	/5%4!=0	/5%5=0
				{
					c++;			//1 go to line 13	/2 goto line 20
				}
			}
			if(c==2)	//c=2
			{	
				System.out.println(a);	//5
			}
			a++;	//5++=6
		}
		while(a<=50);
	}
}
