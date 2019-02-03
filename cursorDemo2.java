import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Iterator;

class thread extends Thread{
	 ArrayList v;
	 thread(ArrayList v){
	 	 this.v=v;
	 }
	 public void run(){
        
        try{
        	Thread.sleep(2000);
        }
        catch(InterruptedException e){}
        System.out.println("thread-2 added elements");
        
        System.out.println("thread-2 remove an element");
        v.remove(0);
	 }
}
class cursorDemo2{

   public static void main(String[] args)throws InterruptedException {
   	 ArrayList v=new ArrayList();
   	 for(int i=1;i<=5;i++){
          v.add(i);
   	 }
   	 Iterator e=v.iterator();
   	 Thread t1=new Thread(new thread(v));
   	  t1.start();
   	  while(e.hasNext()){
   	  	  Thread.sleep(2000);
   	  	  System.out.println("Thread-1 "+e.next());
   	  }
   	  System.out.println(v);
   }
}