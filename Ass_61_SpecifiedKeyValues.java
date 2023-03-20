package Assignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Ass_61_SpecifiedKeyValues 
{
	public static void main(String[] args) 
	{
		HashMap h=new HashMap();
		h.put(1, "Vishrut");
		h.put(2, "Wadhwan");
		h.put(3, "Rishit");
		h.put(4, "Wadhwan");
		
		Set s1=h.entrySet();
		Iterator i=s1.iterator();
		while(i.hasNext())
		{
			Map.Entry m=(Map.Entry) i.next();
			System.out.println("Key Is : "+m.getKey());
			System.out.println("Value Is : "+m.getValue());
		}
		
		
	}
}
