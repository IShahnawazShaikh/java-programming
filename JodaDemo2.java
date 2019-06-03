import java.time.LocalTime;

public class JodaDemo2 {

	public static void main(String[] args) {
		LocalTime t=LocalTime.now();
		int minute=t.getMinute();
		int hours=t.getHour();
		int sec=t.getSecond();
		int nanSec=t.getNano();
		System.out.println("Current Time:-"+t);
		System.out.println("NanoSeconds:-"+nanSec);
		System.out.println("Seconds:-"+sec);
		System.out.println("minutes:-"+minute);
		System.out.println("hours:-"+hours);

	}

}
