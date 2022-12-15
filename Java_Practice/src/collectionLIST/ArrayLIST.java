package collectionLIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayLIST 
{
	public static void main(String[] args) 
	{
		 ArrayList<Object> al = new ArrayList<>();
		 
		 al.add("Chennai");
		 al.add(null);
		 al.add("Trichy");
		 al.add("2637");
		 al.add(null);
		 al.add("Madurai");
		 al.add(true);
		 al.add("Kovai");
		 al.add("Perambalur");
		 al.add(false);
		 
		 System.out.println(al);
		 
		 Object al1 = al.clone();
		 System.out.println(al1);
		 System.out.println(al.equals(al1));
		 System.out.println(al.get(2));
		 System.out.println(al.contains("Kovai"));
		 System.out.println(al.hashCode());
		 System.out.println(al.indexOf(true));
		 System.out.println(al.isEmpty());
		 System.out.println(al.lastIndexOf(null));
		 System.out.println(al.set(3, "000"));
		 System.out.println(al);
		 System.out.println(al.size());
		
		 System.out.println("============For loop=============");
		 
		 for(int i=0;i<=al.size()-1;i++)
		 {
			 System.out.println(al.get(i));
		 }
		 
		 System.out.println("============For each loop==============");
		 for(Object a:al)
		 {
			 System.out.println(a);
		 }
		 System.out.println("============Iterator================");
		 
		 Iterator<Object> it = al.iterator();
		 while(it.hasNext())
		 {
			System.out.println(it.next());
		 }
		 
		 System.out.println("============List Iterator===========");
		 
		 ListIterator<Object> it1 = al.listIterator();
		 while(it1.hasNext())
		 {
			 System.out.println(it1.next());
		 }
	}

}
