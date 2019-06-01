import java.util.ArrayList;
import java.util.Iterator;

public class CopyOnWriteArrayListDemo4 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("A");
		l.add("B");
		l.add("z");
		l.add("p");
		Iterator itr=l.iterator();
		l.add("C");
		l.add("m");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("All the elements of list are: "+l);
	}
   
}
