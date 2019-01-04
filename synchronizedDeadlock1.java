class A{
  
   public synchronized void d1(B b){
   	     System.out.println("Thread-1 start executing d1()");
         try{
         	 Thread.sleep(1000);
         }
         catch(InterruptedException e){}
         System.out.println("Thread 1 waiting for b's Lock to execute last()");
         b.last();
   }
   public synchronized void last(){
   	    System.out.println("In A's Last()");
   } 
}
class B{
 
     public synchronized void d2(A a){
   	     System.out.println("Thread-2 start executing d2()");
         try{
         	 Thread.sleep(1000);
         }
         catch(InterruptedException e){}
         System.out.println("Thread-2 waiting for a's Lock to execute last()");
         a.last();
   }
   public synchronized void last(){
   	    System.out.println("In B's Last()");
   } 

}
class synchronizedDeadlock1 extends Thread{
    A a=new A();
    B b=new B();
    void m1(){
    	  this.start();
    	  System.out.println("main thread calling d1()");
    	  a.d1(b);
    }
    public void run(){
       System.out.println("child thread calling d1()");
       b.d2(a);

    }
   public static void main(String[] args) {
   	     synchronizedDeadlock1 t1=new synchronizedDeadlock1();
   	     t1.m1();
   }
}