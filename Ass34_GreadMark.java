package Assignment;

import java.util.Scanner;

class Grade
{
	public void getGrade(int m)
	{
		if(m>=0 && m<=100)
		{
			if(m>=91 && m<=100)
			{
				System.out.println("Your Grade is >>> AA");
			}
			else if(m>=81 && m<=90)
			{
				System.out.println("Your Grade is >>> AB");
			}
			else if(m>=71 && m<=80)
			{
				System.out.println("Your Grade is >>> BB");
			}
			else if(m>=61 && m<=70)
			{
				System.out.println("Your Grade is >>> BC");
			}
			else if(m>=51 && m<=60)
			{
				System.out.println("Your Grade is >>> CD");
			}
			else if(m>=40 && m<=50)
			{
				System.out.println("Your Grade is >>> DD");
			}
			else
			{
				System.out.println("You Are Fail");
			}
		}
		else
		{
			System.out.println("You Can Enter 0 TO 100 Marks...");
		}
	}
}
public class Ass34_GreadMark 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Marks >>> ");
		int m=s.nextInt();
		
		Grade g=new Grade();
		g.getGrade(m);
		
	}
}
