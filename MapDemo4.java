import java.util.HashMap;

public class MapDemo4 {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(null,1);
		map.put(null,3);
		map.put(1,null);
		map.put(2,null);
		map.put(null,5);
		System.out.println(map);
	}

}
