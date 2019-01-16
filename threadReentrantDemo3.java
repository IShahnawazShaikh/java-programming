import java.util.concurrent.locks.ReentrantLock;
class thread extends Thread{
	ReentrantLock l=new ReentrantLock();
	  public void run(){
	  	   display();
	  }
	  public  void display(){
	  	if(l.tryLock()){
	  	  System.out.println(Thread.currentThread().getName()+" Got Lock");
        for(int i=1;i<=3;i++){ 
               System.out.print("Good Morning:");
               System.out.println(Thread.currentThread().getName());
	  	    }
          l.unlock();
	  	  }
        else{
         System.out.println(Thread.currentThread().getName()+" Not get Lock");
        }
	  }
}
class threadReentrantDemo3{
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