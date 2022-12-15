package collectionLIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistusingLoop 
{
	public static void main(String[] args) 
	{
		ArrayList<Object>al=new ArrayList<>();
		
		al.add("Uma");
		al.add("Sathiya");
		al.add("Advik");
		al.add(null);
		al.add(null);
		al.add(true);
		al.add(2145);
		al.add(null);
		al.add("Mahesh");
		al.add("Seelan");
		
		System.out.println(al);
		
		System.out.println("===========For loop================");
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("===========For each loop=============");
		
		for(Object a:al)
		{
			System.out.println(a);
		}
		
		System.out.println("=================Iterator=============");
		
		Iterator<Object> al0 = al.iterator();
		while(al0.hasNext())
		{
			System.out.println(al0.next());
		}
		
		System.out.println("=================ListIterator=============");
		
		ListIterator<Object> al1 = al.listIterator();
		while(al1.hasNext())
		{
			System.out.println(al1.next());
		}
	}

}
