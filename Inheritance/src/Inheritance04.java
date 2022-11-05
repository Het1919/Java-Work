class Plane
{
	public void fly()
	{
		System.out.println("Plane is flying");
	}
	public void takeOff() //inherited method
	{
		System.out.println("Plane is taking off");
	}
}

class CargoPlane extends Plane
{
	public void fly() //overridden method. 
	{
		System.out.println("CargoPlane flies");
	}
	public void carryGoods() //specialized method
	{
		System.out.println("Cargo plane carry goods");
	}
}
class PassengerPlane extends Plane
{
	public void fly() //overridden method. 
	{
		System.out.println("PassengerPlane flies");
	}
	public void carryPessenger() //specialized method
	{
		System.out.println("Passenger plane carry Passengers");
	}
}
public class Inheritance04 {

	public static void main(String[] args) {
		
		CargoPlane cp=new CargoPlane();
		cp.fly();
		cp.takeOff();
		cp.carryGoods();
		
		PassengerPlane pp=new PassengerPlane();
		pp.fly();
		pp.takeOff();
		pp.carryPessenger();
		
	}

}
