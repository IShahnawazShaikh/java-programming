import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo1 {

	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(10);
		l1.add(2);
		l1.add(4);
		l1.add(13);
		l1.add(9);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		System.out.println(Collections.binarySearch(l1,10));
		
		System.out.println(Collections.binarySearch(l1,19));  //-6
		System.out.println(Collections.binarySearch(l1,16));  //-6
		System.out.println(Collections.binarySearch(l1,3));   //-2
		
	}

}
