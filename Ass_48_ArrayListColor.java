package Assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Ass_48_ArrayListColor 
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
		
		Iterator<String> i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
}
