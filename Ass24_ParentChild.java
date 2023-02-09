package Assignment;

class parent
{
	public void display1()
	{
		System.out.println("This is Parent Class.....");
	}
}
class child extends parent
{
	public void display()
	{
		System.out.println("This is Child class....");
	}
}
public class Ass24_ParentChild 
{
	public static void main(String[] args) 
	{
		parent p=new parent();
		child c=new child();
		
		p.display1();
		c.display();
		System.out.println("---------------------------------------------");
		c.display1();
		c.display();
	}
}
