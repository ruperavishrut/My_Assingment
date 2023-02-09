package Assignment;

import java.util.Scanner;

public class Ass2_Vowel 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter An Alphabet:- ");
		String c=sc.next();
		int length=c.length();
		
		if(length==1)
		{
			boolean a=c.matches("[a-zA-Z]");
			char w=c.charAt(0);
			
			if(a)
			{
				if(w=='a'||w=='e'||w=='i'||w=='o'||w=='u'||w=='A'||w=='E'||w=='I'||w=='O'||w=='U')
				
					System.out.println("Enter Character "+c+" is Volwel");
				
				else
				
					System.out.println(w+"It is Consonant");
			}	
			else 
				System.out.println("Enter Only Alphabet");
				
		}
		else
			System.out.println("Enter only single value");
			
		}
		
	}

