package Assignment;

import java.util.ArrayList;

public class Ass_72_ReplaceSecondElement_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Red");
		a.add("Yellow");
		a.add("Green");
		a.add("Blue");
		a.add("Pink");
		a.add("White");
		a.add("Orange");
		
		System.out.println("ArrayList Is : "+a);
		System.out.println("");
		
		a.set(1, "Pink");
		System.out.println("Replace Second Element In ArrayList : ");
		System.out.println("");
		for(String s:a)
		{
			System.out.println(s);
		}
		
	}
}
