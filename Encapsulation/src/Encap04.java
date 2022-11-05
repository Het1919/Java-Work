class Alien1
{
	private int age;
	private String name;
	
	public Alien1(int age,String name)
	{
		this(); // control goes to the 0 parameterized constructor.
		this.age=age;
		this.name=name;
	}
	public Alien1()
	{
		age=30;
		name="Random";
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
public class Encap04 {

	public static void main(String[] args) {
		
		Alien1 a=new Alien1(19,"Het");
		System.out.println(a.getAge());
		System.out.println(a.getName());

	}

}
