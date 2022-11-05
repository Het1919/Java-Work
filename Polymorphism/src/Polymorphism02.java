class Animal1
{
	public void sleep()
	{
		System.out.println("Animal Sleeping");
	}
	public void eat()
	{
		System.out.println("Animal Eating");
	}
}
class Tiger1 extends Animal1
{
	public void sleep()
	{
		System.out.println("Tiger Sleeping");
	}
	public void eat()
	{
		System.out.println("Tiger Eating");
	}
}
class Monkey extends Animal1
{
	public void sleep()
	{
		System.out.println("Monkey Sleeping");
	}
	public void eat()
	{
		System.out.println("Monkey Eating");
	}
}
class Deer extends Animal1
{
	public void sleep()
	{
		System.out.println("Deer Sleeping");
	}
	public void eat()
	{
		System.out.println("Deer Eating");
	}
}

class Forest
{
	public void Display(Animal1 a)
	{
		a.eat();
		a.sleep();
	}
}
public class Polymorphism02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger1 t=new Tiger1();
		Monkey m=new Monkey();
		Deer d=new Deer();
		
        Forest f=new Forest();
        f.Display(t);
        f.Display(m);
        f.Display(d);
	}

}
