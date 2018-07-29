//program to implement customized sorting(Descending)
class comparator1 implements Comparator
{
	 public static void main(String...x){
       public int compare(Object obj1,Object obj2){
	        if(obj1>obj2){
              return 1;
			}
			else{
			return -1;
			}
	   }
	 }
}
class TreeSetDemo2
{
	 public static void main(String...p){
       TreeSet ts=new TreeSet(new comparator1)
		   ts.add(9);
	       ts.add(10);
		   ts.add(50);
		   ts.add(1);
		   ts.add(8);
		   ts.add(0);
		   ts.add(88);
		   System.out.println(ts);
	 }
}