class thread extends Thread{
	 public void run(){
	 	 for(int i=1;i<=5;i++){
	 	 	  try{
	 	 	  	 Thread.sleep(900);
	 	 	  	}
	 	 	  	catch(InterruptedException IE){}
	 	 	  	System.out.println("Child-"+i);
	 	 }
	 }
}
class threadSuspendResume{
	 public static void main(String[] args) throws InterruptedException {
	 	 thread t1=new thread();
	 	 t1.start();
	 	 Thread.sleep(1900);
	 	 System.out.println("Main is going to suspend child thread");
	 	 t1.suspend();
	 	 //Thread.sleep(1000);
	 	 System.out.println("Main is going to resume Child thread");
	 	 t1.resume();
	 	 System.out.println("main");
	 }
}