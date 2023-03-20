package Assignment;

import java.util.ArrayList;

public class Ass_65_CompareArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Wadhwan");
		a1.add("Surat");
		a1.add("Rajkot");
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Rajkot");
		a2.add("Limbadi");
		a2.add("S.nagar");
		
		ArrayList<String> a3=new ArrayList<String>();
		for(String e:a1)
			a3.add(a2.contains(e)?"Yes":"No");
		System.out.println(a3);
	}
}
