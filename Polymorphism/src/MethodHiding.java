class Telusko
{
	public static void disp()
	{
		System.out.println("Telusko is Parent");
	}
}

class Alien extends Telusko
{
	//static method will get inherited but we can't override it.
	
	public static void disp() //treat as specialized method.It's not override method.
    {
		System.out.println("Alien is Telusko");
	}
}
public class MethodHiding {

	public static void main(String[] args) {
		
		Alien a=new Alien();
		a.disp();
		
		Telusko t=new Alien();
		t.disp();

	}

}
