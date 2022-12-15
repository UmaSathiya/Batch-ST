package collectionLIST;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorLIST
{
	public static void main(String[] args) 
	{
		  Vector<Object> v = new Vector<>();
		  
		  v.add("Dominics");
		  v.add("Roever");
		  v.add(null);
		  v.add("Joseph");
		  v.add("SRMHSS");
		  v.add(true);
		  v.add("EdenGarden");
		  v.add(null);
		  
		  System.out.println(v);
		  System.out.println(v.capacity());
		  Object v1 = v.clone();
		  System.out.println(v1);
		  System.out.println(v.contains(false));
		  System.out.println(v.equals(v1));
		  System.out.println(v.firstElement());
		  System.out.println(v.get(5));
		  System.out.println(v.indexOf(true));
		  System.out.println(v.lastElement());
		  System.out.println(v.set(7,"DSMHSS"));
		  System.out.println(v);
		  System.out.println(v.size());
		  System.out.println(v.elementAt(3));
		  
		  System.out.println("============For loop============");
		  for(int i=0;i<=v.size()-1;i++)
		  {
			  System.out.println(v.get(i));
		  }
		  System.out.println("=============Foreach Loop==============");
		  for(Object v2:v)
		  {
			  System.out.println(v2);
		  }
		  System.out.println("===========Iterator============");
		  Iterator<Object> it = v.iterator();
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
		  System.out.println("============List Iterator==========");
		  ListIterator<Object> i1 = v.listIterator();
		  while(i1.hasNext())
		  {
			  System.out.println(i1.next());
		  }
		  
		  

	}

}
