package Assignment;

import java.util.Scanner;

public class Ass3_Leapyear 
{
	public static void main(String[] args) 
	{
		Scanner yr = new Scanner(System.in);
		
		System.out.print("Enter Your:- ");
		int y=yr.nextInt();
		
		if(y % 4 == 0)
		{
			System.out.println("This year is leap:- "+y);
		}
		else
		{
			System.out.println("Not Leap Year:- "+y);
		}
	}
}
