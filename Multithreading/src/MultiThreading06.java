class Demo7 implements Runnable //Inbuilt Class
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

class Demo8 implements Runnable
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

class Demo9 implements Runnable
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

public class MultiThreading06 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main thread got the chance the first");
		Thread t=Thread.currentThread();
		System.out.println(t.isAlive());//main thread life
		
		Demo7 d7=new Demo7();
		Demo8 d8=new Demo8();
		Demo9 d9=new Demo9();
		
		Thread t1=new Thread(d7);
		Thread t2=new Thread(d8);
		Thread t3=new Thread(d9);
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		
		t1.start();
	    System.out.println(t1.isAlive());
	    t2.start();
		t3.start();
		
	    t1.join(); //wait till t1 joins the main thread.
	    t2.join(); 
     	t3.join();
		
		System.out.println("main thread is completing the first also");
		
	}

}

