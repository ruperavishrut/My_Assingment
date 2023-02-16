package Assignment;

class th1 extends Thread
{
	public void run()
	{
			System.out.println("This is Thread class....");
	}
}

public class Ass_47_SameThread 
{
	public static void main(String[] args) 
	{
		th1 t=new th1();
		t.start();
		t.start();
	}
}
