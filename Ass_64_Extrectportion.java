package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Ass_64_Extrectportion 
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
		System.out.println("First ArrayList Is : "+a);
		
		List<String> a2=a.subList(0, 4);
		System.out.println("");
		System.out.println("Second ArrayList Is : "+a2);


	}
}
