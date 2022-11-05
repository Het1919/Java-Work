import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Date04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZoneId zone = ZoneId.systemDefault();
		ZonedDateTime zdt = ZonedDateTime.now(zone);
		System.out.println(zone);
		System.out.println(zdt);
		
		ZoneId za = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt1 = ZonedDateTime.now(za);
		System.out.println(za);
		System.out.println(zdt1);

	}

}
