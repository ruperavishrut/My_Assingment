package Assignment;

import java.util.ArrayList;

public class Ass_51_RetrieveElement 
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
		
		System.out.println("The Elements Of Array Are "+a);
		System.out.println("----------------------------------------------------");
		//RetrieveElement
		System.out.println("Retrive Elements Are....");
		System.out.println("-----------------------------------------------------");
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(4));
		System.out.println(a.get(5));
	}
}
