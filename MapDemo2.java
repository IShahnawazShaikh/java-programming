import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo2 {
	public static void main(String[] args) {
		Map map=new HashMap();
		for(int i=1;i<=5;i++)
			 map.put(i, 'A'+i);
		for(int i=1;i<=5;i++)
			System.out.println(map.get(i));
		Collection c=map.values();
		Iterator itr=c.iterator();
		while(itr.hasNext()) {
			 System.out.println(itr.next());
		}
		map.put(6, 71);
		Collection c2=map.values();
		Iterator itr2=c2.iterator();
		while(itr2.hasNext()) {
			 System.out.println(itr.next());
		}
		
	}

}
