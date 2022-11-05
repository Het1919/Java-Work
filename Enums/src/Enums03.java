enum Genders
{
	MALE,FEMALE,OTHERS;
	
	//final static Genders MALE = new Genders(); // behind the scenes
	
}
public class Enums03 {

	public static void main(String[] args) 
	{
		Genders g = Genders.MALE;
		System.out.println(g);
		
		Genders[] g1 = Genders.FEMALE.values();
		
		for(Genders ele:g1)
		{
			System.out.println(ele+" "+ele.ordinal());
		}

	}

}
