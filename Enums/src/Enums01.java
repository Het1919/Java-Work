enum Result
{
	PASS,FAIL,NR;
}
public class Enums01 
{
	enum Gender
	{
		MALE,FEMALE,OTHER;
	}

	public static void main(String[] args) {
		
		Result r = Result.PASS;
		System.out.println(r);
		
		Gender g = Gender.MALE;
		System.out.println(g);
		
		int i = Gender.FEMALE.ordinal(); // return index(0 based)
		System.out.println(i);
		
	}

}
