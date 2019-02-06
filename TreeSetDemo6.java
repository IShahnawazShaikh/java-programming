import java.util.TreeSet;
import java.util.Comparator;
class TreeSetDemo6{
	 public static void main(String[] args) {
	 	TreeSet t=new TreeSet(new myComparator());
	 	t.add("E");
	 	t.add("B");
	 	t.add("P");
	 	t.add("A");
	 	System.out.println(t);

	 }
}
class myComparator implements Comparator{
   public int compare(Object obj1,Object obj2){
         //return obj1.toString().compareTo(obj2.toString());   // Ascending
         //return -obj1.toString().compareTo(obj2.toString());    //descending
         //return obj2.toString().compareTo(obj1.toString());       //descending
         return -obj2.toString().compareTo(obj1.toString());       //Ascending
              
   }
}