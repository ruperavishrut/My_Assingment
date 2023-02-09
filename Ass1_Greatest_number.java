package Assignment;

import java.util.Scanner;

public class Ass1_Greatest_number 
{
	public static void main(String[] args) 
	{
			
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Find Maximum Number......");
			
			System.out.print("Enter No1:- ");
			int a=sc.nextInt();
			
			System.out.print("Enter No2:- ");
			int b=sc.nextInt();
			
			System.out.print("Enter No3:- ");
			int c=sc.nextInt();
			
			if(a>b && a>c)
			{
				System.out.println("No1 is Max....."+a);
			}
			else if(b>a && b>c)
			{
				System.out.println("No2 is Max....."+b);
			}
			else
			{
				System.out.println("No3 is Max....."+c);
			}
		}

}
