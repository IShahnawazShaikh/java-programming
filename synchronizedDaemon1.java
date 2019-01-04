class thread extends Thread{
	  public void run(){
         for(int i=0;i<10;i++){
         	 try{
         	    Thread.sleep(1000);
         	    System.out.println("child thread");
           }
           catch(InterruptedException e){}
        }
	  }
}
class synchronizedDaemon1{
	 public static void main(String[] args) {
	 	 thread t1=new thread();
          t1.setDaemon(true);
	 	  t1.start();
	 	 System.out.println("main thread is executed");
	 }
}
