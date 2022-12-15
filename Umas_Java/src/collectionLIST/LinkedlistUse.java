package collectionLIST;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistUse
{
	public static void main(String[] args)
	{
	LinkedList<Object> Ll = new LinkedList<>();
	
	Ll.add("Pune");
	Ll.add("Mumbai");
	Ll.add("Nashik");
	Ll.add(null);
	Ll.add("Thane");
	Ll.add(false);
	Ll.add("Nagar");
	Ll.add("Solapur");
	System.out.println(Ll);
	
	Ll.add(2, null);
	System.out.println(Ll);
	System.out.println(Ll.element());
	System.out.println(Ll.getFirst());
	System.out.println(Ll.getLast());
	System.out.println(Ll.offer("Shirdi"));	//add the object in the tail
	System.out.println(Ll);
	System.out.println(Ll.offerFirst("Ahemednagar"));
	System.out.println(Ll);
	System.out.println(Ll.peek());		//retrieve & don't remove the head element
	System.out.println(Ll);
	System.out.println(Ll.peekFirst());	//retrieve & don't remove the 1st element
	System.out.println(Ll);
	System.out.println(Ll.peekLast());	//retrieve & don't remove the last element
	System.out.println(Ll);
	System.out.println(Ll.poll());		//retrieve & remove the head element
	System.out.println(Ll);
	System.out.println(Ll.pollFirst());	//retrieve & remove the 1st element
	System.out.println(Ll);
	System.out.println(Ll.pollLast());	//retrieve & remove the last element
	System.out.println(Ll);
	System.out.println(Ll.pop());		//retrieve & remove the 1st element each time pop
	System.out.println(Ll);
	System.out.println(Ll.pop());
	System.out.println(Ll);
	System.out.println(Ll.pop());
	System.out.println(Ll);
	
	Ll.push("Raigad");		//insert/push the element at the front of the list
	System.out.println(Ll);
	
	System.out.println("===========For loop=============");
	
	for(int i=0;i<=Ll.size()-1;i++)
	{
		System.out.println(Ll.get(i));
	}
	
	System.out.println("===========For each loop=============");
	
	for(Object ll:Ll)
	{
		System.out.println(ll);
	}
	System.out.println("===========Iterator=============");
	
	Iterator<Object> l1 = Ll.iterator();
	while(l1.hasNext())
	{
		System.out.println(l1.next());
	}
	System.out.println("===========List Iterator=============");
	
	ListIterator<Object> l2 = Ll.listIterator(2);
	while(l2.hasNext())
	{
		System.out.println(l2.next());
	}
	System.out.println("===========Descending Iterator=============");
	
	Iterator<Object> l3 = Ll.descendingIterator();
	while(l3.hasNext())
	{
		System.out.println(l3.next());
	}
	}
}
