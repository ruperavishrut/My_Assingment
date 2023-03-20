package Assignment;

import java.util.ArrayList;
import java.util.Collections;


public class Ass_66_SwapElements 
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
		
		System.out.println("Before Swaping Elements");
		System.out.println(a);
		
		Collections.swap(a, 3, 4);
		
		System.out.println("After Swaping Elements");
		System.out.println(a);
		
		
	}
}
