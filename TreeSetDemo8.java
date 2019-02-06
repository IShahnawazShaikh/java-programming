import java.util.TreeSet;
import java.util.Comparator;
class TreeSetDemo8{
	 public static void main(String[] args) {
	 	TreeSet t=new TreeSet(new myComparator());
	 	t.add(new StringBuffer("ZP"));
	 	t.add(new StringBuffer("AAA"));
	 	t.add("p");
	 	t.add("Lm");
	 	t.add("Opp");
	 	t.add(2.2);
	 	System.out.println(t);

	 }
}
class myComparator implements Comparator{
   public int compare(Object obj1,Object obj2){
        String i1=obj1.toString();              
        String i2=obj2.toString();
        if(i1.length()<i2.length())
        	return -1;
         if(i1.length()>i2.length())
            return +1;
        else
        	return i1.compareTo(i2);
   }
}