package Assignment;

class Member
{
	int Data_members=1;
	String Name="Vishrut";
	int Age =20;
	long Phone_number=820044337;
	String Address="Wadhwan";
	int Salary=1000000;
	
	public void printSalary()
	{
		System.out.println("The Data Member is >>> "+Data_members);
		System.out.println("The Name is >>> "+Name);
		System.out.println("The Age is >>> "+Age);
		System.out.println("The Phone Number is >>> "+Phone_number);
		System.out.println("The Address is >>> "+Address);
		System.out.println("The Salary is >>> "+Salary);
		
	}
	
	
	
}
public class Ass25_Member 
{
	public static void main(String[] args) 
	{
		Member m=new Member();
		m.printSalary();
	}
}
