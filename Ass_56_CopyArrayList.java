package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Ass_56_CopyArrayList
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
		
		System.out.println("List 1 : "+a1);
		System.out.println("List 2 : "+a2);
		
		Collections.copy(a2, a1);
		System.out.print("Now List 2 Is...");
		System.out.println(a2);
		
	}
}
