package Assignment;

import java.util.Scanner;

class Traingle
{
	public Traingle() 
	{
		traingle3();
		traingle4();
		traingle5();
	}
	
	public void traingle3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("This Is 3 Side Traingle : ");
		System.out.println("Enter First Value For 3 Side Traingle: ");
		int t1=sc.nextInt();
		
		System.out.println("Enter Second Value For 3 Side Traingle: ");
		int t2=sc.nextInt();
		
		System.out.println("The 3 side of Traingle is : "+(t1*t2)/2);
	}
	public void traingle4()
	{
		
	}
	public void traingle5()
	{
		
	}
}

public class Ass27_Tringle345
{
	public static void main(String[] args) 
	{
		Traingle t=new Traingle();
	
	}
}
