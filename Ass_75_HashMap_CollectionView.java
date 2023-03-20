package Assignment;

import java.util.HashMap;

public class Ass_75_HashMap_CollectionView 
{
	public static void main(String[] args) 
	{
		HashMap h=new HashMap();
		h.put(1, "Vishrut");
		h.put(2, "Wadhwan");
		h.put(3, "Rishit");
		h.put(4, "Wadhwan");
		
		System.out.println("Element Of HashMap : "+h.values());
	}
}
