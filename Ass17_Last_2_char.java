package Assignment;

import java.util.Scanner;

public class Ass17_Last_2_char 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter First String:- ");
		String s1=s.nextLine();
		
		
		System.out.println("Enter Second String:- ");
		String s2=s.nextLine();
		
		int ls1=s1.length();
		char s1_last=s1.charAt(ls1-1);
		char s1_lastone=s1.charAt(ls1-2);
		
		int ls2=s2.length();
		char s2_last=s2.charAt(ls2-1);
		char s2_lastone=s2.charAt(ls2-2);
		
		if(s1_last==s2_last && s1_lastone==s2_lastone)
		{
			System.out.println(s2_lastone+""+s2_last+""+s2_lastone+""+s2_last+" of Given String Are Same");
		}
		else
		{
			System.out.println(s2_lastone+""+s2_last+""+s2_lastone+""+s2_last+"Last Two Charachter of Given String Are Not Same");
		}
		
	}
}
