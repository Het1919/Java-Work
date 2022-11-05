
class Animal
{
	
}
class Tiger extends Animal
{
	
}

class Plane
{
	protected void fly()
	{
		System.out.println("Palne is flying");
	}
	public Animal ooh()
	{
		Animal a=new Animal();
		return a;
	}
}
class CargoPlane extends Plane 
{
	public void  fly()
	{
		System.out.println("CargoPlane is flying");
	}
	public Tiger ooh()
	{
		Tiger t=new Tiger();
		return t;
	}
}

public class OverridingRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
