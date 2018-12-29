class myclass extends Thread{
	 public void run(){
	 	for(int i=0;i<4;i++){
	   	    try{

	   	    	Thread.sleep(1000);
	   	        System.out.println("child");
	   	    }
	   	    catch(InterruptedException e){
	   	    	  System.out.print("interrupted");
	   	    }
	   } 
	 }
}
class test{
	 public static void main(String[] args) {
	   myclass my=new myclass();
	   my.start();
	   my.interrupt();
	   for(int i=0;i<4;i++){
	   	  System.out.println("main-thread");
	   }   
	 }
}