interface Alien
{
	void show(int num);
}

public class Lambda02 {

	public static void main(String[] args) {
		
		Alien obj = num -> System.out.println("In Show "+num);
        obj.show(5);
	}

}
