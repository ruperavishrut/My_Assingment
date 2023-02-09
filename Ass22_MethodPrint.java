package Assignment;

class print
{
	public void print_char_num(char c,int n)
	{
		System.out.println("The Char Value Is >>> "+c);
		System.out.println("The Integar Value IS >>> "+n);
	}
	public void print_char_num(int n,char c)
	{
		System.out.println("The Integar Value IS >>> "+n);
		System.out.println("The Char Value Is >>> "+c);
	}
}
public class Ass22_MethodPrint 
{
	public static void main(String[] args) 
	{
		print p1=new print();
		p1.print_char_num('v', 21);
		System.out.println("----------------------------------------------------");
		p1.print_char_num(111, 'K');
	}
}
