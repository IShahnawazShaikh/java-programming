class threadStopDemo extends Thread{
	 public void run(){
	 	   for(int i=1;i<=20;i++){
	 	   	  if(i==10){
	 	   	  	  System.out.println("child thread is dead");
	 	   	  	  this.stop();
	 	   	  }
	 	   	  System.out.println("child-"+i);

	 	   }
	 }
	 public static void main(String[] args) {
	 	threadStopDemo t=new threadStopDemo();
	 	t.start();
	    for(int i=1;i<=20;i++){
	 	   	  System.out.println("main-"+i);
	 	   }	
	 }
}