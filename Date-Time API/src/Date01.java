public class Date01 {

	public static void main(String[] args) {
		
		java.util.Date utilDate = new java.util.Date();
		System.out.println(utilDate); // Thu Nov 03 16:14:16 IST 2022
		
		long hour = utilDate.getHours();
		System.out.println(hour);
		
		long time = utilDate.getTime();
		System.out.println(time);
		
		java.sql.Date sqlDate = new java.sql.Date(hour);
		System.out.println(sqlDate); // 1970-01-01 (year-month-day)
        
		java.sql.Date sql2Date = new java.sql.Date(time);
		System.out.println(sql2Date); // 1970-01-01 (year-month-day)
	}

}