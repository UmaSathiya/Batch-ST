package collectionSET;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetUse 
{
	public static void main(String[] args) 
	{
		HashSet<Object> Hs=new HashSet<>();
		
		Hs.add("Pune");
		Hs.add(null);
		Hs.add(218);
		System.out.println(Hs.add(876));
//		Hs.add(null);		only 1 null allowed
//		Hs.add("Pune");		duplicates are not allowed
		Hs.add("Wagholi");
		System.out.println(Hs.add(876));
		Hs.add(true);
		
		System.out.println(Hs);
		System.out.println("================Iterator================");
		Iterator<Object> hs = Hs.iterator();
		while(hs.hasNext())
		{
			System.out.println(hs.next());
		}
		System.out.println("================For each loop================");
		
		for(Object hs1:Hs)
		{
			System.out.println(hs1);
		}
	}

}
