interface Calculator
{
	void add();
	void sub();
}

class MyCalc implements Calculator
{
	public void add() 
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void sub() 
	{
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}
}

class MyCalc1 implements Calculator
{
	public void add()
	{
		int a=20;
		int b=5;
		int c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a=20;
		int b=5;
		int c=a-b;
		System.out.println(c);
	}
}

class Cal
{
	public void permit(Calculator c)
	{
		c.add();
		c.sub();
	}
}

public class Interface01 {

	public static void main(String[] args) {
		
		MyCalc m1=new MyCalc();
		MyCalc1 m2=new MyCalc1();
        
		Cal c=new Cal();
		c.permit(m1);
		c.permit(m2);
	}

}
