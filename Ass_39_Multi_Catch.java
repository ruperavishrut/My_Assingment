package Assignment;

import java.util.Scanner;

class Traingle1
{
	public Traingle1() 
	{
		traingle3();
		traingle4();
		traingle5();
	}
	
	public void traingle3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("This Is 3 Side Traingle.... ");
		System.out.println(" ");
		System.out.println("Enter Value For 3 Side Traingle: ");
		
		double t1=sc.nextDouble();
		double t2=sc.nextDouble();
		double t3=sc.nextDouble();
		
		double peramiter =t1+t2+t3;
		
		System.out.println("The Perimiter of The Traingle IS >>> "+peramiter);
		
		double s=peramiter/2;
		
		double area=Math.sqrt(s*(s-t1)*(s-t2)*(s-t3));
		
		System.out.println("The Area of The Taingle is >>> "+area);
	}
	public void traingle4()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Enter Value For 4 Side Traingle: ");
		
		double t1=sc.nextDouble();
		double t2=sc.nextDouble();
		double t3=sc.nextDouble();
		double t4=sc.nextDouble();
		
		double peramiter =t1+t2+t3+t4;
		System.out.println("The Perimiter of The 4 side Traingle IS >>> "+peramiter);
		
		double l1=(t1+t2)/2;
		double w1=(t3+t4)/2;
		
		System.out.println("Area Of 4 side Traingle IS : "+(l1*w1));
		
	}
	public void traingle5()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Enter Value For 5 Side Traingle: ");
		
		double t1=sc.nextDouble();//5
		double t2=sc.nextDouble();//4
		double t3=sc.nextDouble();//8
		double t4=sc.nextDouble();//4
		double t5=sc.nextDouble();//5
		
		double peramiter = t1+t3+t5;
		double sp=peramiter/2;
		double area = Math.sqrt(sp*(sp-t1)*(sp-t3)*(sp-t5));
		//System.out.println(area);
		
		double area2=t2*t3;
		//System.out.println(area2);	
		System.out.println("Area Of 5 Side Traingle : "+(area+area2));
		
		
	}
}
public class Ass_39_Multi_Catch 
{

	public static void main(String[] args) 
	{
		try 
		{
			Traingle1 t=new Traingle1();
		}
		catch (ArithmeticException e) 
		{
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
}
