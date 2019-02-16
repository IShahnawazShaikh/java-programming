import java.util.TreeSet;
import java.util.Comparator;
@FunctionalInterface
interface Sort{
	void sorting(int a);
}
public class LambdaExpressionDemo5{ 
	public static void main(String...x){
	  TreeSet <Integer> t=new TreeSet<Integer>(new myComparator());
	  Sort ss=(value)->t.add(value);
	  ss.sorting(44);
	  ss.sorting(40);
	  ss.sorting(5);
	  ss.sorting(14);
	  ss.sorting(0);
	  
	  System.out.println(t);
  }
	
}
class myComparator implements Comparator{
	 public int compare(Object o1,Object o2){
		 Integer i1=(Integer)o1;
		 Integer i2=(Integer)o2;
		 if(i1>i2)
			 return -1;
		 if(i1<i2)
			 return +1;
		 else 
			 return 0;
	 }
}
