import java.util.HashMap;

public class MapDemo1 {

	public static void main(String[] args) {
		HashMap mp=new HashMap();
		HashMap mp2=new HashMap();
		mp.put(1,'B');
		mp.put(2,'C');
		mp.put(3,'D');
		mp.put(4,'E');
		mp.putIfAbsent(5,'F');
		System.out.println(mp.size());
	      for(int i=1;i<=mp.size();i++) {
			System.out.println(mp.remove(i,'D'));
			}
		System.out.println(mp.size());
		for(int i=1;i<=mp.size();i++) {
			System.out.println(mp.get(i));
			}
		System.out.println(mp2.put(8,'P'));
		System.out.println(mp2.put(6,'G'));
	    mp.putAll(mp2);
		System.out.println(mp.size());
	   System.out.println(mp.get(1));
	   System.out.println(mp.get(6));
	   System.out.println(mp.containsKey(14)); 
	   System.out.println(mp.containsValue('G'));
	   
	   //System.out.println(mp.equals(mp));
	   mp.clear();
	   System.out.println(mp.size());
	}
}
