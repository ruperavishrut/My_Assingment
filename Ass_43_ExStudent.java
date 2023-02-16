package Assignment;

class AgeEx extends Exception
{
	int age;
	public AgeEx(int age) 
	{
		this.age=age;
	}
	
}
class NameEx extends Exception
{
	String nm;
	public NameEx(String nm) 
	{
		this.nm=nm;
	}
	
}
class Student_1
{
	int rno,age;
	String nm,course;
	
	public Student_1(int rno,int age,String nm,String course) 
	{
		this.rno=rno;
		this.age=age;
		this.nm=nm;
		this.course=course;
		
		try 
		{
			check();
		}
		catch (NameEx e) 
		{
			System.out.println(e.nm+"NameNotValidException");
		}
		catch (AgeEx e) 
		{
			System.out.println(e.age+"AgeNotWithinRangeException");
		}
	}
	public void check() throws NameEx, AgeEx
	{
		if(age >= 15 && age <= 21)
		{
			boolean as=nm.matches("^[a-zA-Z]+$");
			if(as)
			{
				System.out.println("Your RollNo Is >>> "+rno);
				System.out.println("Your Name Is >>> "+nm);
				System.out.println("Your Age Is >>> "+age);
				System.out.println("Your Course Is >>> "+course);
			}
			else
			{
				throw new NameEx(nm);
			}
		}
		else
		{
			throw new AgeEx(age);
		}
	}
}
public class Ass_43_ExStudent 
{
	public static void main(String[] args) 
	{
		Student_1 s1=new Student_1(1, 20, "Vishrut", "BscIT");
		
	} 
	
}
