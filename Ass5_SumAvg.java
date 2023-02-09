package Assignment;

import java.util.Scanner;

public class Ass5_SumAvg 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		int sum=0;
		float avg=0f;
		for(int i=1;i<=5;i++)
		{
			System.out.print("Enter "+i+" Number :- ");
			int num=s.nextInt();
			sum=sum+num;
		}
		System.out.println("The Sum of Five No is: "+sum);
		System.out.println("The Average of five no is:- "+(avg=(float)sum/5));
	}
}
