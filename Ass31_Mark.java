package Assignment;

abstract class Mark
{
	public abstract void getper();
}
class Student_A extends Mark
{
	int sub1,sub2,sub3;
	public Student_A(int a,int b,int c,int d) 
	{
		sub1=a;
		sub2=b;
		sub3=c;
	
	}
	@Override
	public void getper() 
	{
		float per=(sub1+sub2+sub3)/3f;
		System.out.println("Persantege of Student A is >>> "+per);
	}
	
	
}
class Student_B extends Mark
{
	int sub1,sub2,sub3,sub4;
	public Student_B(int a,int b,int c,int d) 
	{
		sub1=a;
		sub2=b;
		sub3=c;
		sub4=d;
	}
	@Override
	public void getper() 
	{
		float per=(sub1+sub2+sub3+sub4)/4f;
		System.out.println("Persantege of Student B is >>> "+per);
	}
	
	
}

public class Ass31_Mark 
{
	public static void main(String[] args) 
	{
		Student_A a=new Student_A(89, 84, 81, 90);
		Student_B b=new Student_B(89, 78, 87, 96);
		
		a.getper();
		b.getper();
	}
}
