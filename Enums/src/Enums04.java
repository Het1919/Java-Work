enum Result1
{
	PASS, FAIL, NR;	
	
	//public final static Result1 PASS = new Result1(); (B.T.S.)
	Result1()
	{
		System.out.println("Lets how many times");
	}
}
public class Enums04 {

	public static void main(String[] args) {
		
		Result1 r = Result1.FAIL;
		
		// Result1 rr = new Result1(); not possible
		
		switch(r)
		{
		case PASS: System.out.println("Passed");
		break;
		case FAIL: System.out.println("Fails");
		break;
		case NR: System.out.println("No Result");
		break;
		}

	}

}
