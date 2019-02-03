import java.util.LinkedHashSet;
import java.util.Vector;
class LinkedHashSetDemo1{
  public static void main(String[] args) {
  	LinkedHashSet hs=new LinkedHashSet(20);
  	System.out.println(hs.add(1));
  	System.out.println(hs.add(9));
  	System.out.println(hs.add(3));
  	System.out.println(hs.add(null));
  	System.out.println(hs.add(1));
  	System.out.println(hs.add(null));
  	System.out.println(hs.add(1));
  	
  	System.out.println(hs);
  	}
}