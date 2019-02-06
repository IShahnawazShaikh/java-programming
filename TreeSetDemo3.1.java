import java.util.TreeSet;
import java.util.Iterator;
class TreeSetDemo3{
	 public static void main(String[] args) {
	 	TreeSet t=new TreeSet();
	 System.out.print(t.add("A".compareTo("Z")));  //true
	 System.out.print(t.add("A".compareTo("Z")));   //false
 	 System.out.print(t.add("B".compareTo("P")));   //true
 	
	 	System.out.println(t);      // [-25,-14]
	 	Iterator itr=t.iterator();
	 	while(itr.hasNext()){
	 		 System.out.println(itr.next());
	 	}
	 }
}