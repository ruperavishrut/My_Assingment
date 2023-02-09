package Assignment;

abstract class Bank
{
	int a=100,b=150,c=200;
	public abstract void getBalanc();
	
	public void msg()
	{
		System.out.println("Welcome To Our Bank..");
	}
}
class Bank_A extends Bank
{

	@Override
	public void getBalanc() 
	{
		System.out.println("The Balanc Of A IS >>> "+a);
	}
	
}
class Bank_B extends Bank
{

	@Override
	public void getBalanc() 
	{
		System.out.println("The Balanc Of B IS >>> "+b);	
	}
	
}
class Bank_C extends Bank
{

	@Override
	public void getBalanc() 
	{
		System.out.println("The Balanc Of C IS >>> "+c);	
	}
	
}
public class Ass30_BankDeposite 
{
	public static void main(String[] args)
	{
		Bank_A a=new Bank_A();
		a.msg();
		a.getBalanc();
		
		Bank_B b=new Bank_B();
		b.getBalanc();
		
		Bank_C c=new Bank_C();
		c.getBalanc();
	}
}
