public class Static02 {
	
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
	static void display1()
	{
		System.out.println("Static Block");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
    
	int m,n,o;
	
	{
		System.out.println("non static block");
		m=100;
		n=200;
		o=300;
		a=11;
		b=12;
		c=13;
	}
	
	Static02()
	{
		System.out.println("Constructor");
	}
	
	void display2()
	{
		System.out.println("non static block");
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		
	    System.out.println("main method");
	    display1();
        
	    Static02 s=new Static02();
	    s.display2();
	   
	}

}
