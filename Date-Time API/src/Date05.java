import java.time.LocalDate;
import java.time.Period;

public class Date05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today = LocalDate.now(); //current date
		LocalDate birthday = LocalDate.of(2003, 1, 19);
		
		Period p = Period.between(birthday,today);
		
		System.out.println("age is "+p.getYears()+" years "+p.getMonths() +" months " + p.getDays()+" days");
		
		LocalDate today1 = LocalDate.now(); //current date
		LocalDate birthday1 = LocalDate.of(2002, 8, 6);
		
		Period p1 = Period.between(birthday1,today1);
		
		System.out.println("age is "+p1.getYears()+" years "+p1.getMonths() +" months " + p1.getDays()+" days");

	}

}
