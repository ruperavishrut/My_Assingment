package Assignment;

class area
{
	public void find(int a)
	{
		System.out.println("Squer area is >>> "+(a*a));
	}
	public void find(int l,int b)
	{
		System.out.println("Rectengale area is >>> "+(l*b));
	}
}

public class Ass23_Area 
{
	public static void main(String[] args) 
	{
		area a=new area();
		a.find(10);
		a.find(50, 100);
	}
}
