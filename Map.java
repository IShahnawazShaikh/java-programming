import java.util.HashMap; 
import java.util.IdentityHashMap; 
import java.util.Map;
public class test{
	public static void main(String...x) {
	   IdentityHashMap IP = new IdentityHashMap();
		HashMap HP= new HashMap();
		String str =new String("shahnawaz");
		 IP.put(str, 1);
		HP.put(str, 1);
		boolean p1 = IP.containsKey("shahnawaz");       //false
		boolean p2 =HP.containsKey("shahnawaz");        //true
		System.out.println(p1);
		System.out.println(p2);
		}
}