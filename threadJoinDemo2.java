
  /*-----------------------Waiting Child Thread until Completing Main Thread--------------------*/

/*-------------------------------------First Approach---------------------------------------*/
class threadJoinDemo2 extends Thread{
	Thread main;
	threadJoinDemo2(Thread main){
       this.main=main;
	}
	public void run(){
         try{
		System.out.println("Join Main Thread");
         	main.join();
         }
         catch(InterruptedException IE){}
		 System.out.println("child Thread");
	}
	public static void main(String[] args)throws InterruptedException {
		 threadJoinDemo2 t1=new threadJoinDemo2(Thread.currentThread());//Main Thread Reference
		 t1.start();
		 Thread.sleep(1000);
		 System.out.println("main Thread");
	}
}
/*-------------------------------------Second Approach---------------------------------------*/
class threadJoinDemo2 extends Thread{
	static Thread main;
	
	public void run(){
         try{
		System.out.println("Join Main Thread");
         	main.join();
         }
         catch(InterruptedException IE){}
		 System.out.println("child Thread");
	}
	public static void main(String[] args)throws InterruptedException {
		 threadJoinDemo2.main=Thread.currentThread();
		 threadJoinDemo2 t1=new threadJoinDemo2();//Main Thread Reference
		 t1.start();
		 Thread.sleep(1000);
		 System.out.println("main Thread");
	}
}