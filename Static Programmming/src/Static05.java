//WAP to count no. of objects in a program.

class Alien
{
	private int age;
	private String name;
	
	static int count;
	
	{
		count++;
	}
	
	Alien()
	{
		
	}
	Alien(int age)
	{
		this.age=age;
	}
	Alien(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
}
public class Static05 {

	public static void main(String[] args) {
		
		Alien a1=new Alien();
		Alien a2=new Alien(19);
		Alien a3=new Alien(19,"Het");
		
		System.out.println(Alien.count);

	}
}
