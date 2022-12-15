package string;

public class StringMthdAsmt 
{
	public static void main(String[] args)
	{
		String a="Tamil";
		String a1="tamil";
		String a2="ENGLISH";
		String a3="";
		String a4="  ";
		String a5="Perambalur";
		String b=new String("taamil");
		String b1=new String("Taamil");
		
//.equals()
		System.out.println(a.equals(a1));
		System.out.println(a.equals(b));
		System.out.println(b.equals(b1));
//.equalsIgnoreCase()
		System.out.println(a.equalsIgnoreCase(a1));
		System.out.println(b.equalsIgnoreCase(b1));
//.contains()
		System.out.println(b.contains("am"));
		System.out.println(b1.contains("Taam"));
//.isEmpty()
		System.out.println(a2.isEmpty());
		System.out.println(a3.isEmpty());
		System.out.println(a4.isEmpty());
//.isBlank()
		System.out.println(a3.isBlank());
		System.out.println(a4.isBlank());
//.toLowerCase()
		System.out.println(a2.toLowerCase());
//.toUpperCase()
		System.out.println(b.toUpperCase());
//.length()
		System.out.println(a1.length());
//.charAt()
		System.out.println(a2.charAt(3));
//.endsWith()
		System.out.println(b1.endsWith("i"));
		System.out.println(a2.endsWith("H"));
//.startsWith()
		System.out.println(a2.startsWith("e"));
		System.out.println(a5.startsWith("e", 1));
//.substring()
		System.out.println(a5.substring(3));
		System.out.println(a2.substring(0, 3));
//.split()
		String c="peek:a:boo";
		String[] c1 = c.split(":");
	
		for(String c2:c1)
		{
			System.out.println(c2);	
		}
//.concat()
		System.out.println(a.concat(b));
//.indexOf()
		System.out.println(c.indexOf('k'));
//.lastIndexOf()
		System.out.println(c.lastIndexOf('e'));
//.replace()
		System.out.println(c.replace('o', 'e'));
//

	}

}
