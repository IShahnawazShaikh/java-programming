import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapDemo8 {

	public static void main(String[] args) {
		SortedMap Smap=new TreeMap();
		for(int i=1;i<=5;i++)
			Smap.put(i,'A'+i);
	System.out.println(Smap);
	 SortedMap map1=Smap.headMap(4);
	 System.out.println(map1);
	 SortedMap map2=Smap.subMap(2,4);
	 System.out.println(map2);
	 System.out.println(Smap.firstKey());
	 SortedMap map3=Smap.tailMap(2);
	 System.out.println(map3);
	 
	 Comparator c=Smap.comparator();
	 System.out.println(c);
	}
	

}
