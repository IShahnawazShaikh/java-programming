import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentDemo2{
	public static void main(String[] args) throws InterruptedException {
		ConcurrentHashMap map=new ConcurrentHashMap();
		map.put(1,'A');
		map.put(2,'B');
		map.put(3,'C');
		map.put(4,'D');
		map.put(5,'E');
	    new Thread(()->{
			 for(int i=6;i<=11;i++) {
			     System.out.println(Thread.currentThread().getName()+" is modifying");
			     map.put(i,(char)(66+i));
				  try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
					e.printStackTrace();
					}
				}
			}).start();
		Set keys=map.keySet();
        Iterator itr=keys.iterator();
        while(itr.hasNext()) {
        Integer i=(Integer)itr.next();
		System.out.println(Thread.currentThread().getName()+" Thread is iterating: "+i+"-"+map.get(i));
		Thread.sleep(2000);
        }
        System.out.println(map);
   }
}