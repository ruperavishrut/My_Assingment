package Assignment;

import java.util.ArrayList;

public class Ass_54_SearchElement 
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
		
		if(a.contains("Vishrut"))
		{
			System.out.println("Element Is Fount");
		}
		else
		{
			System.out.println("Element Not Found");
		}
	}
}
