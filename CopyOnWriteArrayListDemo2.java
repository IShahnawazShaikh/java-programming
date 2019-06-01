import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		ArrayList l3=new ArrayList();
		CopyOnWriteArrayList l2=new CopyOnWriteArrayList();
		
		l1.add('A');
		l1.add('B');
		
		l2.add('C');
		l2.add('A');
		l2.addAll(l1);
		
		System.out.println(l2);  //[C,A,A,B]
		
		l3.add('D');
		l3.add('A');
		l3.add('A');
		l3.add('B');
		l2.addAllAbsent(l3);   //[C,A,A,B,D]
		
		System.out.println(l2);
		
	}

}
