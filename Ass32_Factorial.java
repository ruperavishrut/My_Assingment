package Assignment;

import java.util.Scanner;

class fact
{
	public void Factorial(int no)
	{
		int fact=1;
		
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("The Factoroacl is >>> "+fact);
	}
}
public class Ass32_Factorial 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter No >>> ");
		int n=s.nextInt();
		fact f=new fact();
		f.Factorial(n);
	}
}
