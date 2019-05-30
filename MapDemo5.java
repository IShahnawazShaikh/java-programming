import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {

	public static void main(String[] args) {
		 HashMap map=new HashMap();
		 IdentityHashMap Imap=new IdentityHashMap();
		 Integer i1=new Integer(10);
		 Integer i2=new Integer(10);
		 map.put(i1,101);
		 map.put(i2,102);
		 Imap.put(i1,101);
		 Imap.put(i2,102);
		 System.out.println(map);
		 System.out.println(Imap);
		System.out.println(Imap.get(i2));
			
	}

}
