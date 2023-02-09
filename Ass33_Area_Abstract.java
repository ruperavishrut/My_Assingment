package Assignment;

abstract class Shape
{
	public abstract void RectangleArea(int l,int w);
	public abstract void SquareArea(int side);
	public abstract void CircleArea(int radius);
}
class Area1 extends Shape
{

	@Override
	public void RectangleArea(int l, int w) 
	{
		System.out.println("Area of Rectangle is >>> "+(l*w));	
	}

	@Override
	public void SquareArea(int side) 
	{
			System.out.println("Area of Square is >>> "+(side*side));
	}

	@Override
	public void CircleArea(int radius) 
	{
			final float pi=3.1415f;
			float r=(radius/(2*pi));
			System.out.println("Area of Circle is >>> "+r);
	}
	
}

public class Ass33_Area_Abstract 
{
	public static void main(String[] args) 
	{
		Area1 a= new Area1();
		a.RectangleArea(40, 50);
		a.SquareArea(25);
		a.CircleArea(20);
	}
}
