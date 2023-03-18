package Assignment;

import java.util.ArrayList;

public class Ass_52_UpdateElements 
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
		
		System.out.println("Update Elements...");
		a.set(3, "Hariom");
		a.set(6, "Kishan");
		System.out.println(a);
	}
}
