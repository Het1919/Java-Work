class Plane1
{
	public void fly()
	{
		System.out.println("Plane is flying");
	}
	public void takeoff()
	{
		System.out.println("Plane gonna takeoff");
	}
}

class CargoPlane1 extends Plane1
{
	public void fly()
	{
		System.out.println("Cargoplane is flying");
	}
	public void takeoff()
	{
		System.out.println("CargoPlane takeoff");
	}
}

class FighterPlane extends Plane1
{
	public void fly()
	{
		System.out.println("Fighterplane is flying");
	}
	public void takeoff()
	{
		System.out.println("FighterPlane takeoff");
	}
}

class Airport
{
	public void permit(Plane1 p)
	{
		p.takeoff();
		p.fly();
	}
}

public class Polymorphism01 {

	public static void main(String[] args) {
		
		CargoPlane1 cp=new CargoPlane1();
		FighterPlane fp=new FighterPlane();
//		
//		cp.takeoff();
//		cp.fly();
//		
//		fp.takeoff();
//		fp.fly();
		
//		Plane1 p;
//		p=cp;
//		p.takeoff();
//		p.fly();
//		
//		p=fp;
//		p.takeoff();
//		p.fly();
		
		Airport a=new Airport();
		a.permit(cp);
		a.permit(fp);

	}

}
