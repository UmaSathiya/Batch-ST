package loopstmt;

public class Dowhile {

	public static void main(String[] args) {
		// to print 19th table
		int i;
		int j=1;
		do
		{
			i=j*19;
			System.out.println(j+"*19="+i);
			j++;
		}
		while(i<=171);
		}
}
