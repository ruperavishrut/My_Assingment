package Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ass_69_HashSetToArrayList 
{
	public static void main(String[] args) 
	{
		HashSet<String> h=new HashSet<String>();
		h.add("Vishrut");
		h.add("Rishit");
		h.add("Yash");
		h.add("Tarun");
		h.add("Keval");
		h.add("Om");
		h.add("Nimish");
		
		System.out.println("HashSet  Is : "+h);
		System.out.println("");
		
		List<String> l=new ArrayList<String>(h);
		System.out.println("Converted ArrayList Is : "+l);
	}
}
