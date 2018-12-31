class threadImplementation implements Runnable{
	 public void run(){
	 	  for(int i=0;i<2;i++){
	 	  	  System.out.println(Thread.currentThread().getName()+" Executed-"+(i+1));
	 	  }
	 }
}
class threadGroup{
	 public static void main(String[] args) {
	 	ThreadGroup tGroup1=new ThreadGroup("Group-A");
	 	ThreadGroup tGroup2=new ThreadGroup("Group-B");
	 	Thread t1=new Thread(tGroup1,new threadImplementation(),"thread-A1");
	 	Thread t2=new Thread(tGroup1,new threadImplementation(),"thread-A2");
	 	Thread t3=new Thread(tGroup2,new threadImplementation(),"thread-B1");
	 	Thread t4=new Thread(tGroup2,new threadImplementation(),"thread-B2");
	 	t1.start();
	 	t2.start();
	 	t3.start();
	 	t4.start();
	  }
}