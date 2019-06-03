import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class JodaDemo3 {

	public static void main(String[] args) {
		LocalDate birtday=LocalDate.of(1998,9,25);
		LocalDate currentDate=LocalDate.now();
		
		
		Period p=Period.between(birtday, currentDate);
		System.out.println("years:"+p.getYears());

		System.out.println("Months:"+p.getMonths());

		System.out.println("Days:"+p.getDays());
	}

}
