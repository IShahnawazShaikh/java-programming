import java.util.concurrent.locks.ReentrantLock;
class thread extends Thread{
	ReentrantLock l=new ReentrantLock();
	  public void run(){
	  	   display();
	  }
	  public  void display(){
	  	l.lock();
	  	  for(int i=1;i<=3;i++){ 
               System.out.print("Good Morning:");
               try{
               	 Thread.sleep(1000);
               }
               catch(InterruptedException e){e.printStackTrace();}
               System.out.println(Thread.currentThread().getName());
	  	    }
	  	    l.unlock();
	  	    //System.out.println("after Lock");
	  }
}
class threadReentrantDemo2{
   public static void main(String[] args) {
   	  thread d=new thread();
   	  Thread t1=new Thread(d,"shahnawaz");
   	  Thread t2=new Thread(d,"Arif");
   	  Thread t3=new Thread(d,"Luppo");
   	  t1.start();
   	  t2.start();
   	  t3.start();
   }
}