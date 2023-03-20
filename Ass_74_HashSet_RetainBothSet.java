package Assignment;

import java.util.HashSet;

public class Ass_74_HashSet_RetainBothSet 
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
		
		System.out.println("The First HashSet Elements Are : "+h);
		
		HashSet<String> h1=new HashSet<String>();
		h1.add("Vishrut");
		h1.add("Rishit");
		h1.add("Yash");
		h1.add("Ghanshyam");
		h1.add("Keval");
		h1.add("Om");
		h1.add("Dhruv");
		
		System.out.println("");
		
		System.out.println("The Second HashSet Elements Are : "+h1);
		
		h.retainAll(h1);
		
		System.out.println("");
		System.out.println("The HashSet Contain Only This Elements : "+h);
	}
}
