import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JodaDemo5 {

	public static void main(String[] args) {
	 ZoneId z=ZoneId.systemDefault();
	 System.out.println("Zone:-"+z);
	 ZonedDateTime z2=ZonedDateTime.now();
     System.out.println("Zone date time :-"+z2);
     
     ZoneId z3=ZoneId.of("America/Los_Angeles");
     System.out.println("Zone:-"+z3);

     System.out.println("Zone date time :-"+ZonedDateTime.now(z3));

     ZoneId z4=ZoneId.of("America/New_York");
     System.out.println("Zone:-"+z4);
     System.out.println("Zone date time :-"+ZonedDateTime.now(z4));
     System.out.println(z4.getId());
	}

}
