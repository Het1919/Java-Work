class Demo
{
	public static void disp1()
	{
		System.out.println("Static Method");
	}
	public void disp2()
	{
		System.out.println("non static method");
	}
}
public class Static04 {

	public static void main(String[] args) {
		
        Demo.disp1();//without creating object.(static method)
        Demo d=new Demo();
//        d.disp1();
        d.disp2();
	}

}
