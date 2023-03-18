package Assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Ass_49_Iterator 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(110);
		a.add(220);
		a.add(330);
		a.add(440);
		a.add(550);
		a.add(660);
		a.add(770);
		a.add(880);
		a.add(990);
		
		Iterator<Integer> i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
