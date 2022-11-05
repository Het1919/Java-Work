interface Calc1
{
	void add(int a,int b);
}
interface Calc2
{
	void sub(int a,int b);
}

class MyCalculator implements Calc1,Calc2
{
	public void add(int a,int b)
	{
		int result=a+b;
		System.out.println(result);
	}
	public void sub(int a,int b)
	{
		int result=a-b;
		System.out.println(result);
	}
}
public class Interface02 {

	public static void main(String[] args) {
		
		MyCalculator my=new MyCalculator();
		my.add(10, 20);
		my.sub(10, 20);

	}

}
