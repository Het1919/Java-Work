public class Static01 {
	
	//static variables
	static int a,b,c;
	
    //static block
	static 
	{
		System.out.println("Static Block");
		a=10;
		b=20;
		c=30;
	}
	
	//static method
	static void display()
	{
		System.out.println("Static Block");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		
	    System.out.println("main method");
	    display();

	}

}
