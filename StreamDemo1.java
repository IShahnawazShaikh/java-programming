import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
	public static void main(String... x) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(20);
		l1.add(3);
		l1.add(5);
		l1.add(8);
		l1.add(12);
		l1.add(25);
		l1.add(3);
		l1.add(16);
		System.out.println("before opeartion List:" + l1);
		Comparator<Integer> c = (a, b) -> (a > b) ? -1 : (a < b) ? +1 : 0;
		Stream stream1 = l1.stream();
		List l2 = (List) stream1.filter(i -> (int) i % 2 == 0).collect(Collectors.toList());
		System.out.println("After filter List: " + l2);
		// List
		// al5=(List)stream1.filter(i->(int)i%2==0).collect(Collectors.toList());
		stream1.close();
		List l3 = (List) l1.stream().map(i -> (int) i + 10).collect(Collectors.toList());
		System.out.println("After Map List: " + l3);

		List l4 = (List) l1.stream().map(i -> (int) i + 10).sorted().collect(Collectors.toList());
		System.out.println("After Map and default sorting List: " + l4);

		List l5 = (List) l1.stream().map(i -> (int) i + 10).sorted(c).collect(Collectors.toList()); // c->Comparator
		System.out.println("After Map and customized sorting List: " + l5);

		/* Count number of objects in list */
		Stream stream2 = l1.stream();
		long count = stream2.filter(i -> (int) i % 2 != 0).count();
		System.out.println("number of Odd Integer Object present in List :" + count);
		stream2.close();
		/* min() and max() */

	}

}
