package Assignment;


abstract class parent1
{
	public void show()
	{
		System.out.println("This IS Parent Class...");
	}
	
	public abstract void message(); 
}
class sub1 extends parent1
{

	@Override
	public void message() 
	{
		System.out.println("This Is First SubClass....");
	}
	
}

class sub2 extends parent1
{

	@Override
	public void message() 
	{
			System.out.println("This Is Second SubClass....");
	}
	
}
public class Ass29_Abstract 
{
	public static void main(String[] args) 
	{
		sub1 s1=new sub1();
		s1.show();
		s1.message();
		
		sub2 s2=new sub2();
		s2.message();
		
		
		
		
			}
	
}
