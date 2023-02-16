package Assignment;

class th_1 extends Thread
{
	public void run()
	{
		System.out.println("This Is Thread class... ");
	}
}

public class Ass_45_Exthread 
{
	public static void main(String[] args) 
	{
		th_1 t =new th_1();
		t.start();
	}
}
