package Assignment;

import java.util.ArrayList;

public class Ass_73_ArrayList_PositionOfArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a= new ArrayList<String>(3);
		a.add("Vishrut");
		a.add("Rishit");
		a.add("Yash");
		a.add("Tarun");
		
		System.out.println("ArrayList Is : "+a);
		
		int no=a.size();
		
		for(String s :a)
			System.out.println(s);
	}
}
