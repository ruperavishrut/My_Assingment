package Assignment;

class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("First Thread...."+i);
		}
		System.out.println("First Thread Is Completed...");
	}
}

public class Ass_46_thread2 
{
	public static void main(String[] args) 
	{
		Thread1 t1=new Thread1();
		t1.start();
		
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Main Thread...."+i);
		}
		System.out.println("Main Thread Is Completed....");
	}
}
