class Demo1 extends Thread //Inbuilt Class
{
	public void run()// Definition of thread
	{
		System.out.println("Banking task Started");
		for(int i=0;i<3;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Banking.........");
		}
	   System.out.println("Banking completed....");
	}
}

class Demo2 extends Thread
{
	public void run()
	{
		System.out.println("Printing task Started");
		for(int i=0;i<3;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Printing.........");
		}
	   System.out.println("Printing completed....");
	}
}

class Demo3 extends Thread
{
	public void run()
	{
		System.out.println("Calculation task Started");
		for(int i=0;i<3;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Calculating.........");
		}
	   System.out.println("Calculation completed....");
	}
}

public class MultiThreading03 {

	public static void main(String[] args) throws Exception {
		
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
		
		d1.start(); // gives life to the thread.
		d2.start();
		d3.start();	

	}
}
