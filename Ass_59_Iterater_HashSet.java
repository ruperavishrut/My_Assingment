package Assignment;

import java.util.HashSet;
import java.util.Iterator;

public class Ass_59_Iterater_HashSet 
{
	public static void main(String[] args) 
	{
		
			HashSet h=new HashSet();
			h.add("Red");
			h.add("Yellow");
			h.add("Green");
			h.add("Blue");
			h.add("Pink");
			h.add("White");
			h.add("Orange");
			h.add("Gray");
			
			Iterator i=h.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		
	}
}
