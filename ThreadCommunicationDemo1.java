class thread extends Thread{
	 int sum=0;
	 public void run(){
	 	synchronized(this){
	 	  System.out.println("Child Thread start Calculation");
	 	   for(int i=1;i<=100;i++){
             sum=sum+i;
	 	  }
	 	  System.out.println("Child Thread give notification");
	 	  this.notify();
	 	}
	 }
}
class ThreadCommunicationDemo1 
{
	 public static void main(String[] args)throws InterruptedException {
	   thread t=new thread();
	   t.start();
	    synchronized(t){
	    	 System.out.println("Main Thread call wait()");
	    	  t.wait();
	    	  //t.wait(10000);
	    	  System.out.println("Main Thread got notification");
	       System.out.println(t.sum); 
	    }
	 }
}