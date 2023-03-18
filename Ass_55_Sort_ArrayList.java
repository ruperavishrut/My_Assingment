package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Ass_55_Sort_ArrayList 
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
		Collections.sort(a);
		System.out.println("Sort ArrayList Is....");
		System.out.println(a);
	}
}
