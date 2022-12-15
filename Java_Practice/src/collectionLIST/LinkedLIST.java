package collectionLIST;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLIST
{
	public static void main(String[] args) 
	{
		LinkedList<Object> ll = new LinkedList<>();
		
		ll.add("TamilNadu");
		ll.add("Karnataka");
		ll.add(null);
		ll.add("Kerala");
		ll.add(true);
		ll.add("Andhra");
		ll.add("1234");
		ll.add("Telungana");
		ll.add(false);
		ll.add("Maharashtra");
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.contains("pune"));
		System.out.println(ll.element());
		System.out.println(ll.get(5));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.indexOf(false));
		System.out.println(ll.lastIndexOf(null));
		System.out.println(ll.offer("Delhi"));
		System.out.println(ll);
		System.out.println(ll.offerFirst("Goa"));
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.poll());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		System.out.println(ll.pop());
		ll.push("1234");
		System.out.println(ll);
		
		System.out.println("===========For loop=============");
		
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("===========For each loop=============");
		
		for(Object l0:ll)
		{
			System.out.println(l0);
		}
		System.out.println("===========Iterator=============");
		
		Iterator<Object> l1 = ll.iterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println("===========List Iterator=============");
		
		ListIterator<Object> l2 = ll.listIterator(2);
		while(l2.hasNext())
		{
			System.out.println(l2.next());
		}
		System.out.println("===========Descending Iterator=============");
		
		Iterator<Object> l3 = ll.descendingIterator();
		while(l3.hasNext())
		{
			System.out.println(l3.next());
		}

	}

}
