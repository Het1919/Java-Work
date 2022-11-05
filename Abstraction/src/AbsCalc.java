import java.util.Scanner;

abstract class Shapes 
{
	abstract void input();
	abstract void compute();
	float area;
	
	void disp()
	{
		System.out.println("The area is "+area);
	}
}

class Rectangle1 extends Shapes
{
	float len;
	float bre;
	
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of a rectangle");
		len=scan.nextFloat();
		System.out.println("Enter Breadth of a rectangle");
		bre=scan.nextFloat();
	}
	
	void compute()
	{
		area=len*bre;
	}
}

class Sqaure1 extends Shapes
{
	float len;
	
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of a square");
		len=scan.nextFloat();
	}
	
	void compute()
	{
		area=len*len;
	}
}

class Circle1 extends Shapes
{
	float radius;
	final float pi=3.14f;
	
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter radius of a circle");
		radius=scan.nextFloat();
	}
	
	void compute()
	{
		area=pi*radius*radius;
	}
}

class Geometry
{
	void permit(Shapes s)
	{
		s.input();
		s.compute();
		s.disp();
	}
}

public class AbsCalc {

	public static void main(String[] args) {
		
		Rectangle1 r=new Rectangle1();
		Sqaure1 s=new Sqaure1();
		Circle1 c=new Circle1();
		
		Geometry g=new Geometry();
		g.permit(r);
		g.permit(s);
		g.permit(c);
		

	}

}
