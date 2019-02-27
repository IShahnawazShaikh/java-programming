import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream2Demo2 {
	public static void main(String[] args) {
		 ArrayList l1=new ArrayList();
		  l1.add(20);l1.add(3);l1.add(5);l1.add(8);l1.add(12);l1.add(25);l1.add(3);l1.add(16);
	  System.out.println("before opeartion List:"+l1);
		Stream stream1=l1.stream();
	    Object min=stream1.min((a,b)->((Integer) a).compareTo((Integer)b)).get();
		System.out.println("In ascending order min="+min);
		Stream stream2=l1.stream();
	    Object min2=stream2.min((a,b)->((Integer) b).compareTo((Integer)a)).get();
		System.out.println("In descending order min="+min2);
		
		Stream stream3=l1.stream();
	    Object max1=stream3.max((a,b)->((Integer) a).compareTo((Integer)b)).get();
		System.out.println("In ascending order max="+max1);
		Stream stream4=l1.stream();
	    Object max2=stream4.max((a,b)->((Integer) b).compareTo((Integer)a)).get();
		System.out.println("In descending order max="+max2);
	     	
	}
}
