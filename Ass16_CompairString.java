package Assignment;

import java.util.Scanner;

public class Ass16_CompairString 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter String_1:- ");
		String s1=sc.nextLine();
		
		System.out.println("Enter String_2:- ");
		String s2=sc.nextLine();
		
		int c=(s1.compareTo(s2));
		
		if(c==0)
		{
			System.out.println("Bothe String Are Same");
		}
		else
		{
			System.out.println("Bothe String Are Not Same");
		}
		
		
	}
}
