import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;
class thread extends Thread{
	ReentrantLock l=new ReentrantLock();
	  public void run(){
	  	   display();
	  }
	  public  void display(){
	  	 do{
         try{
           System.out.println(Thread.currentThread().getName()+" try to get Lock");
          if(l.tryLock(2,TimeUnit.SECONDS)){
            System.out.println(Thread.currentThread().getName()+" got Lock");
            Thread.sleep(15000);
            System.out.println(Thread.currentThread().getName()+" releasing lock");
            l.unlock();
            break;
          }
          else{
               System.out.println(Thread.currentThread().getName()+" unable to get Lock");
            }
          }
       catch(InterruptedException ae){ae.printStackTrace();}
       }while(true);
     }
}
class threadReentrantDemo4{
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