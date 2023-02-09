package Assignment;

class Shape1
{
	public void msg()
	{
		System.out.println("This Is Shape Class...");
	}
}
class Circle1 extends Shape1
{
	public void msg1()
	{
		System.out.println("This Is Circle shape...");
	}
}
class Rectangle1 extends Shape1
{
	public void msg2()
	{
		System.out.println("This Is Rectangle shape...");
	}
}

class SquareAB extends Rectangle1
{
	public void msg3()
	{
		System.out.println("Squer Is Rectangle");
	}
}

public class Ass35_Squer_Rect_Circle 
{
	public static void main(String[] args) 
	{
		SquareAB s=new SquareAB();
		s.msg2();
		s.msg3();
		
		
	}
}
