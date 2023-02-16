package Assignment;

class th implements Runnable
{

	@Override
	public void run()
	{
		System.out.println("This Is Runnable State....");
	}
	
}


public class Ass_44_RunnableThreade 
{
	public static void main(String[] args) 
	{
		th t=new th();
		Thread th1=new Thread(t);
		th1.start();
	}
	
	
	
}
