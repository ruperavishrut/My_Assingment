package Assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ass_62_HashMapSize 
{
	public static void main(String[] args) 
	{
		HashMap h=new HashMap();
		h.put(1, "Vishrut");
		h.put(2, "Wadhwan");
		h.put(3, "Rishit");
		h.put(4, "Wadhwan");
		
		System.out.println("Element Of HashMap : "+h);
		System.out.println("Size Of HashMap : "+h.size());
	}
}
