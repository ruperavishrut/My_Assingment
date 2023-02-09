package Assignment;

public class Ass36_Try_catch 
{
	public static void main(String[] args) 
	{
		try
		{
			int a=10;
			int b=0;
			System.out.println("The Divition is "+(a/b));
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
