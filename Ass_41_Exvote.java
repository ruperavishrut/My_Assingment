package Assignment;

import java.util.Scanner;


class Vote 
{
	public void votingAge(int age) 
	{
		if(age > 18)
		{
			System.out.println("Welcome TO Vote...");
		}
		else
		{
			
			throw new ArithmeticException("Invalid Age..."+age); 
			
		}
	}
}
public class Ass_41_Exvote 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age=s.nextInt();
		
		Vote v=new Vote();
		try {
			v.votingAge(age);
		} 
		
		catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		
	}
}
