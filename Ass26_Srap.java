package Assignment;


class Rectangle
{
	int length,breadth;
	
	public Rectangle(int a,int b) 
	{
		length=a;
		breadth=b;
	}
	
	public void area()
	{
		System.out.println("The Area of Rectangle is >> "+(length*breadth));
	}
	public void perimeter()
	{
		System.out.println("The perimeter of Rectangle is >> "+2*(length+breadth));
	}
}
class Square extends Rectangle
{
		int s;
	public Square(int a) 
	{
		super(a, a);
		s=a;
	}
	public void sarea()
	{
		System.out.println("The Area of Rectangle is >> "+(s*s));
	}
	public void sperimeter()
	{
		System.out.println("The perimeter of Rectangle is >> "+(4*s));
	}
	
}

public class Ass26_Srap 
{
	public static void main(String[] args) 
	{
		Square s=new Square(10);
		s.area();
		s.perimeter();
		s.sarea();
		s.sperimeter();
	}
}
