package Assignment;

import java.util.Scanner;

public class Ass18_StringWordCompair 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter First String:- ");
		String s1=s.nextLine();
		
		System.out.println("Enter Second String:- ");
		String s2=s.nextLine();
		
		char w1=s1.charAt(0);
		char w2=s1.charAt(1);
		char w3=s1.charAt(2);
		
		char w1_1=s2.charAt(0);
		char w2_2=s2.charAt(1);
		char w3_3=s2.charAt(2);
		
		if(w1==w1_1 && w2==w2_2 && w3==w3_3)
		{
			System.out.println("The Three Numbers of Strings are Same");
		}
		else
		{
			System.out.println("The Three Numbers of Strings are Not  Same");
		}
		
		
	}
	
	
	
}
