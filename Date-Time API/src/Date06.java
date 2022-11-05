import java.time.Year;

public class Date06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer data = Integer.parseInt(args[0]);
		Year year = Year.of(data);
		
		if(year.isLeap())
		{
			System.out.println("Leap Year " + data);
		}
		else
		{
			System.out.println("Not a Leap year "+data);
		}

	}

}
