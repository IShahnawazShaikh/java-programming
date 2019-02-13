import java.util.PriorityQueue;
class QueueDemo1{
  public static void main(String[] args) {
  	 PriorityQueue p=new PriorityQueue();
  	 System.out.println(p.poll());
  	 //System.out.println(p.element());   NOSuchFileElementException
  	
  	 p.offer(1);
  	 p.offer(5);
  	 p.offer(0);
  	// p.offer("2");   ClassCastException 
  	 p.offer(2);
  	 System.out.println(p);     // [0,1,2,5]
  	 System.out.println(p.poll());  //0
  	 System.out.println(p);    //[1,2,5]
  }
}