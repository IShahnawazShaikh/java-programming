import java.util.TreeSet;
import java.util.Comparator;
class TreeSetDemo7{
	 public static void main(String[] args) {
	 	TreeSet t=new TreeSet();
	 	// t.add(new StringBuffer("Z"));
	 	// t.add(new StringBuffer("A"));
	 	// t.add(new StringBuffer("P"));
	 	// t.add(new StringBuffer("S"));
	 	// t.add(new StringBuffer("L"));
	 	// t.add(new StringBuffer("a"));
	 	t.add(1);
	 	t.add(4.4);
	 	System.out.println(t);

	 }
}
class myComparator implements Comparator{
   public int compare(Object obj1,Object obj2){
         return -obj2.toString().compareTo(obj1.toString());       //Ascending
              
   }
}