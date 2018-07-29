//program to implement customized sorting(Descending)
import java.util.*;
 class comparator1 implements Comparator
{
       public int compare(Object obj1,Object obj2){
		   Character value1=(Character)obj1;
		   Character value2=(Character)obj2;
	        if(value1>value2){
              return -1;
			}
			else if(value1<value2){
			return 1;
			}
			else{
				return 0;
			}
	   }
	}
class TreeSetDemo3
{
	 public static void main(String...p){
       TreeSet ts=new TreeSet(new comparator1());
		   ts.add('A');
	       ts.add('D');
		   ts.add('X');
		   ts.add('M');
		   ts.add('R');
		   ts.add('N');
		   ts.add('P');
		   System.out.println(ts);
	 }
}