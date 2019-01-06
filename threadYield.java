class thread extends Thread{
    public void run(){
    	  for(int i=1;i<=4;i++){
    	  	if(i==3){
    	  		 System.out.println("child yielded");
    	  		 Thread.yield();
    	  	}
    	  	System.out.println("child-"+i);
    	  	  
    	  }
    }
 } 

class threadYield{
	 public static void main(String[] args) {
	 	thread t1=new thread();
	 	t1.start();
	 	for(int i=1;i<=4;i++){
    	  	System.out.println("main-"+i);
    	  }
	 }
}