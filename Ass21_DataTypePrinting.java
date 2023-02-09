package Assignment;


class printNumber
{
	public void printn(int a)
	{
		System.out.println("Int Value Is...."+a);
	}
	public void printn(float a)
	{
		System.out.println("float Value Is...."+a);
	}
	public void printn(long a)
	{
		System.out.println("long Value Is...."+a);
	}
	public void printn(double a)
	{
		System.out.println("Double Value Is...."+a);
	}
	public void printn(String a)
	{
		System.out.println("String Value Is...."+a);
	}
	public void printn(char a)
	{
		System.out.println("Charecter Value Is...."+a);
	}
	public void printn(byte a)
	{
		System.out.println("byte Value Is...."+a);
	}
	public void printn(boolean a)
	{
		System.out.println("boolean Value Is...."+a);
	}
	
	
}
public class Ass21_DataTypePrinting 
{
	public static void main(String[] args) 
	{
		printNumber p=new printNumber();
		p.printn(111);//int
		p.printn(12.3f);//float
		p.printn(232323367);//long
		p.printn(34834.3434534534f);//double
		p.printn(true);//boolean
		p.printn('v');//char
		p.printn("Vishrut");//String
		p.printn(2);//byte
		
		
	}
}
