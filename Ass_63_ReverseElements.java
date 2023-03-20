package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Ass_63_ReverseElements 
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
		a.add("Gray");
		
		System.out.println(a);
		Collections.reverse(a);
		System.out.println("");
		System.out.println("Reverse Elements Are....");
		System.out.println("");
		System.out.println(a);
		
	}
}
