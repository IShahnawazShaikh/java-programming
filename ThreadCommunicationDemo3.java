import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.Random;
class ThreadCommunicationDemo3{
	 public static void main(String[] args) {
		Random random = new Random();
	    BlockingQueue <Integer>queue=new LinkedBlockingQueue<Integer>();
  new Thread(()->{
		   while(true){
		     try{
			 Thread.sleep(1000);
	        System.out.println("consumed="+ queue.take());
	      }
	    catch(InterruptedException ae){
	      ae.printStackTrace();
	    }
	  }//loop close
	 }).start();
	 new Thread(()->{
      while(true){
		   int element=random.nextInt(5);
		 System.out.println("Producer  produced = "+element);
		 try{
            Thread.sleep(1000);
			queue.put(element);
		 } 
		 catch(InterruptedException ae){
	      ae.printStackTrace();
	     }
	   }//loop close
	}).start();
 }
 }