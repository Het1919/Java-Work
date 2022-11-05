import java.time.*;
public class Date03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime dt =LocalDateTime.now();
		System.out.println(dt);
        
		LocalDateTime dt1 =LocalDateTime.of(2003,1,19,6,45);
		System.out.println(dt1);
		System.out.println(dt1.plusMonths(6)); //giving new object not the same object.
		System.out.println(dt1.minusMonths(6)); // subtract from old one.
		System.out.println(dt1); // as it is as previous.
	}

}
