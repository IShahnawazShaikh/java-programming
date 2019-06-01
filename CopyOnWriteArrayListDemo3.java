import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo3 {

	public static void main(String[] args) {
		CopyOnWriteArrayList l=new CopyOnWriteArrayList();
		l.add("A");
		l.add("B");
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			 if(itr.next().equals("B"))
				  itr.remove();  //at this point we get UnsupportedOperationException
			 else
				 System.out.println("ok");
		}
	}

}
