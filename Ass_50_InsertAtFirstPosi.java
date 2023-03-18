package Assignment;

import java.util.ArrayList;

public class Ass_50_InsertAtFirstPosi 
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(1);
		a.add("Vishrut");
		
		System.out.println(a);
		
		a.add(0, "First Element");
		System.out.println(a);
	}
}
