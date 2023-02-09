
package Assignment;

import java.util.Scanner;

public class Ass10_AsciiValue 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter Character:- ");
		char c=s.next().charAt(0);
		int num=c;
		
		System.out.println("The ASCII value of "+c+" is :- "+(int)c);
		
	}
}
