import java.util.PriorityQueue;
import java.util.Comparator;
class QueueDemo2{
  public static void main(String[] args) {
  	 PriorityQueue p=new PriorityQueue(10,new myComparator());

  	 p.offer("shahnawaz");
  	 p.offer("shah");
  	 p.offer("let");
  	 p.offer("M");
  	  
  	 System.out.println(p);    
  }
}
class myComparator implements Comparator{
   public int compare(Object obj1,Object obj2){
            String o1=obj1.toString();       
            String o2=obj2.toString(); 

            return o1.compareTo(o2);      
   }
}