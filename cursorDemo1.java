import java.util.Enumeration;
import java.util.Vector;

class thread extends Thread{
	 Vector v;
	 thread(Vector v){
	 	 this.v=v;
	 }
	 public void run(){
        
        try{
        	Thread.sleep(2000);
        }
        catch(InterruptedException e){}
        System.out.println("thread-2 added elements");
        v.addElement(6);
        v.addElement(7);
        System.out.println("thread-1 remove an element");
        v.removeElementAt(0);
	 }
}
class cursorDemo1{

   public static void main(String[] args)throws InterruptedException {
   	 Vector v=new Vector();
   	 for(int i=1;i<=5;i++){
          v.addElement(i);
   	 }
   	 Enumeration e=v.elements();
   	 Thread t1=new Thread(new thread(v));
   	  t1.start();
   	  while(e.hasMoreElements()){
   	  	  Thread.sleep(2000);
   	  	  System.out.println("Thread-1 "+e.nextElement());
   	  }
   	  System.out.println(v);
   }
}