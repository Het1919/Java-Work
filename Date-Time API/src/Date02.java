import java.time.*;
public class Date02 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
        
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		
		System.out.println(dd+"/"+mm+"/"+yy);
		System.out.printf("%d-%d-%d\n",dd,mm,yy);
		
		int hr = time.getHour();
		int min= time.getMinute();
		int sec= time.getSecond();
		int ns = time.getNano();
		
		System.out.println(hr+":"+min+":"+sec+":"+ns);
}

}

