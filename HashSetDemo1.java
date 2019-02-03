import java.util.HashSet;
import java.util.Vector;
class HashSetDemo1{
  public static void main(String[] args) {
  	HashSet hs=new HashSet(20);
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