class thread implements Runnable{
	  static private synchronized void staticDisplay(){
	  	   for(int i=0;i<2;i++){
           System.out.println(Thread.currentThread().getName()+" static display excecuted-"+(1+i));
	    }
	 }
      private synchronized void noneStaticDisplay(){
	  	   for(int i=0;i<2;i++){
           System.out.println(Thread.currentThread().getName()+" none Static display excecuted-"+(1+i));
	    }
	 }

	 public void run(){
          System.out.println(Thread.currentThread().getName()+" called run()"); 
	 	   staticDisplay();
	 	   noneStaticDisplay();
	 }
}
class synchronizedStatic{
   public static void main(String[] args) {
   	  thread th=new thread();
   	  Thread t1=new Thread(th,"Thread-1");
   	  Thread t2=new Thread(th,"Thread-2");
   	  Thread t3=new Thread(th,"Thread-3");
   	  t1.start();
   	  t2.start();
   	  t3.start();
   }
}