package collectionLIST;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorList 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector<>();
		
		v.add(287);
		v.add(null);
		v.add(null);
		v.add(123);
		v.add(567);
		v.add(423);
		
		System.out.println(v);
		
		v.add(2, 901);
		System.out.println(v);
		
		System.out.println(v.capacity());
		System.out.println(v.contains(567));
		Object v1 = v.clone();
		System.out.println(v1);
		System.out.println(v1.equals(v));
		System.out.println(v.hashCode());
		System.out.println(v.indexOf(null));
		System.out.println(v.isEmpty());
		System.out.println(v.lastIndexOf(null));
		System.out.println(v.remove(null));
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.firstElement());
		System.out.println(v.get(5));
		System.out.println(v.set(1, null));
		System.out.println(v);
		System.out.println(v.elementAt(3));
		
		System.out.println("===============Forloop===============");
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("===============For each loop===============");
		
		for(Integer v11:v)
		{
			System.out.println(v11);
		}
		
		System.out.println("===============Iterator===============");
		
		Iterator<Integer> v2 = v.iterator();
		while(v2.hasNext())
		{
			System.out.println(v2.next());
		}
		System.out.println("===============List Iterator===============");
		
		ListIterator<Integer> v3 = v.listIterator();
		while(v3.hasNext())
		{
			System.out.println(v3.next());
		}
		
		System.out.println("===============Enumeration===============");
		
		Enumeration<Integer> v4 = v.elements();
		while(v4.hasMoreElements())
		{
			System.out.println(v4.nextElement());
		}
	}

}
