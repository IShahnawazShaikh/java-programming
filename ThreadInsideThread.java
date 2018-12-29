class thread1 implements Runnable{
	 public void run(){ 
	 	 for(int i=0;i<3;i++){
          System.out.println(Thread.currentThread().getName()+" executed-"+(1+i));
         new thread2();
        }
	 }
}
class ThreadInsideThread{
	 public static void main(String...x) {
	     thread1 th=new thread1();
	 	 Thread t1=new Thread(th);	 
         t1.start();
         
	 	System.out.println(Thread.activeCount());
         for(int i=0;i<3;i++){
         System.out.println(Thread.currentThread().getName()+" executed-"+(1+i));
       }
     }
}
class thread2 extends Thread{
       thread2(){
       	  this.start();
       }
	    public void run(){ 
	 	 for(int i=0;i<3;i++){
          System.out.println(Thread.currentThread().getName()+" executed-"+(1+i));
       }

	 }
}