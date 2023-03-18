package Assignment;

import java.util.ArrayList;

public class Ass_53_RemoveElement 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Vishrut");
		a.add("Rishit");
		a.add("Yash");
		a.add("Tarun");
		a.add("Keval");
		a.add("Om");
		a.add("Nimish");
		System.out.println(a);
		System.out.println("------------------------------------------------------");
		
		System.out.println("Remove Third Element In ArrayList....");
		a.remove(2);
		System.out.println(a);
	} 
	
}
