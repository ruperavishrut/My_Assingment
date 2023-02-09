package Assignment;

public class Ass38_Nesting_Catch 
{
	public static void main(String[] args) 
	{
		try
		{
			int a=10;
			int b=0;
			System.out.println("The Divition is "+(a/b));
			
			int c[]=new int[5];
			c[5]=10;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			e.printStackTrace();
		}
	}
	
	
}
