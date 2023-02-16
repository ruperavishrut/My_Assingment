package Assignment;

import java.util.Scanner;

class ATM extends Exception
{
	double Amount;
	public ATM(double needs) 
	{
		Amount=needs;
	}
}
class Bank_1 
{
	double balance=0,Deposit,withdraw;
	
	public void deposit()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your First Deposit....");
		Deposit=s.nextDouble();
		balance+=Deposit;
		System.out.println(balance+ "Rs is Successfully Deposit....");
		
	}
	public void Withdeaw() throws ATM
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Withdraw Amount....");
		withdraw=s1.nextDouble();
		
		if(withdraw <= balance)
		{
			System.out.println("Withdeaw Sussesfully...."+withdraw);
		}
		else
		{
			
			double needs=withdraw-balance;
			throw new ATM(needs);
		}
	}
}
public class Ass_42_ExBank 
{
	public static void main(String[] args) 
	{
		Bank_1 b=new Bank_1();
		b.deposit();
		try 
		{
			b.Withdeaw();
		} 
		catch (ATM e) 
		{
			System.out.println("Sorry, insufficient balance, you need more" +e.Amount +"Rs. To perform this transaction");
		}
		
	}
}
