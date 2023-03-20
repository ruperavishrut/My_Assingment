package Assignment;

import java.util.ArrayList;

public class Ass_71_increaseSize_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a= new ArrayList<String>(3);
		a.add("Vishrut");
		a.add("Rishit");
		a.add("Yash");
		
		System.out.println("ArrayList of 3 Size : "+a);
		
		a.ensureCapacity(6);
		
		a.add("Keval");
		a.add("Om");
		a.add("Tarun");

		System.out.println("Increase Size In ArrayList With 6th Elements : "+a);
		
	}
}
