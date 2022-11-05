package in.ineuron.main;

class Alien
{
	int x; // Instance Variable, they are by default initialize with the value 0 for integer ,0.0 for double and so on
	int y=1;
	double w;
	
	void Print()
	{
		int z=2;   // Local Variable and it must be initialize.
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
	}
}


public class Class2 {

	public static void main(String[] args) {
	
		Alien a=new Alien();
		a.Print();
	}

}