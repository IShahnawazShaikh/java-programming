import java.util.TreeSet;
import java.util.Comparator;
class TreeSetDemo5{
	 public static void main(String[] args) {
	 	TreeSet<Integer> t=new TreeSet<Integer>(new myComparator());
	 	t.add(2);
	 	t.add(5);
	 	t.add(1);
	 	t.add(6);
	 	System.out.println(t);

	 }
}
class myComparator implements Comparator{
   public int compare(Object obj1,Object obj2){
         Integer i1=(Integer)obj1;
         Integer i2=(Integer)obj2;
         if(i1<i2)
         	return +1;
         if(i2<i1)
         	return -1;
         else
         	return 0;
   }
}