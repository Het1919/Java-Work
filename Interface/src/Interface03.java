interface Calcu
{
	void add();
}

class MyCalcu
{
	void sub()
	{
		int a=20;
		int b=30;
		int c=a-b;
		System.out.println(c);
	}
}

class MyC extends MyCalcu implements Calcu
{
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
}
public class Interface03 {

	public static void main(String[] args) {
		
		MyC m=new MyC();
		m.add();
		m.sub();

	}

}
