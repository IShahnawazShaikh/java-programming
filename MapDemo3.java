import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class MapDemo3 {

	public static void main(String[] args) {
		Map map=new HashMap();
		for(int i=1;i<=5;i++) {
			 map.put(i,'A'+i);
		}
     System.out.println("All the keys from the Map are:");
      Set keys=map.keySet();
      Collection c=map.values();
      System.out.println(keys);
      System.out.println("All the values from the Map are:");
      System.out.println(c);
      System.out.println("All the entries of the Map are:");
      Set entry=map.entrySet();
      System.out.println(entry);
      
      Iterator itr=entry.iterator();
      while(itr.hasNext()) {
    	  Map.Entry m1=(Map.Entry)itr.next();
    	  System.out.println(m1.getKey()+"  "+m1.getValue());
    	  if(m1.getKey()==(Integer)3) {
    		   m1.setValue(680);
    		   System.out.println("inside");
    	  }
      }
      System.out.println(map);
      
      
      
      
      
      
	}

}
