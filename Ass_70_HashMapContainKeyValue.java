package Assignment;

import java.util.HashMap;

public class Ass_70_HashMapContainKeyValue 
{
	public static void main(String[] args) 
	{
		HashMap h=new HashMap();
		h.put(1, "Vishrut");
		h.put(2, "Wadhwan");
		h.put(3, "Rishit");
		h.put(4, "Wadhwan");
		
		System.out.println("Element Of HashMap : "+h);
		
		System.out.println("Is Key 2 Is Present ? : "+h.containsKey(2));
		
		System.out.println("");
		
		System.out.println("Is Key 3 Is Present ? : "+h.containsKey(3));
		
		System.out.println("");
		
		System.out.println("Is Key 5 Is Present ? : "+h.containsKey(5));
	}
}
