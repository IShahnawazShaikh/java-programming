class threadJoinDeadlock extends Thread{
	static Thread main;
	
	public void run(){
         try{
         	System.out.println("child is join to main");
         	main.join();
         }
         catch(InterruptedException IE){}
		 System.out.println("child Thread");
	}
	public static void main(String[] args)throws InterruptedException{
		 threadJoinDeadlock.main=Thread.currentThread();
		 threadJoinDeadlock t1=new threadJoinDeadlock();
		 t1.start();
		 System.out.println("main join to child");
		 t1.join();
		 System.out.println("main Thread");
	}
}