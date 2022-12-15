package stringBuffer;

public class StringBufferUse 
{
	public static void main(String[] args) 
	{
		StringBuffer s = new StringBuffer("Chennai");
		StringBuffer s1 = new StringBuffer("Tamil Nadu");
		
		s.append(true);
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.charAt(5));
		System.out.println(s.codePointAt(4));
		System.out.println(s.codePointBefore(1));
		System.out.println(s.compareTo(s1));
		System.out.println(s1.substring(0,5));

	}

}
