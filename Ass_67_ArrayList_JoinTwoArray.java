package Assignment;

import java.util.ArrayList;

public class Ass_67_ArrayList_JoinTwoArray 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Vishrut");
		a1.add("Rishit");
		a1.add("Yash");
		
		System.out.println("First ArrayList Is : "+a1);
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Tarun");
		a2.add("Keval");
		a2.add("Om");
		
		System.out.println("Second ArrayList Is : "+a2);
		
		ArrayList<String> a3=new ArrayList<String>();
		a3.addAll(a1);
		a3.addAll(a2);
		System.out.println("Join Array List Is : "+a3);
	}
}
