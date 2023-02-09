package Assignment;

import java.util.Scanner;

public class Ass8_NumberDigit 	
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		int count=0;
		
		System.out.println("Enter Less Than Billion Number : ");
		long num =s.nextLong();
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(" ");
		System.out.println("Number of Digits In The Number IS : "+count);
	}
}
