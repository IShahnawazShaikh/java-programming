import java.time.LocalDate;
import java.time.LocalTime;

public class JodaDemo1 {

	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
		System.out.println("Current Date:-"+d);
		LocalDate d2=d.plusDays(2);
		System.out.println("Date after added 2 days:-"+d2);
		
		LocalDate d3=d.minusDays(2);
		System.out.println("Date after minus 2 days:-"+d3);
		
		System.out.println("Day from the "+d+" is "+d.getDayOfMonth());
		System.out.println("Month from the "+d+" is "+d.getMonthValue());
		System.out.println("Year from the "+d+" is "+d.getYear());
		
		boolean leap=d.isLeapYear();
		System.out.println("Leap Year:-"+leap);
		
		System.out.println("Note: LocalDate Class Contains Many more Methods");
		
		
	}

}
