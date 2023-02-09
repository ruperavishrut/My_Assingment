package Assignment;

import java.util.Scanner;

public class Ass37_Arithmethic 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter NO1: ");
			int no1=s.nextInt();
		
			System.out.println("Enter No2: ");
			int no2=s.nextInt();
		
			System.out.println("The Diviton of Two Number IS : "+(no1/no2));
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
