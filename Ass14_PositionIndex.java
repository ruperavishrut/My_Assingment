package Assignment;

import java.util.Scanner;

public class Ass14_PositionIndex 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter Your String:- ");
		String s=sc.nextLine();
		
		System.out.println("Enter Index:-");
		int i=sc.nextInt();
		
		System.out.println(s.charAt(i));
	}
}
