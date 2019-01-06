class threadInterrupt extends Thread{
	 
	 public void run(){
	 	 try{
	 	 	 for(int i=1;i<=10;i++){
	 	 	 	System.out.println("I am Lazy Threda");
	 	 	 	 Thread.sleep(1000);
	 	 	 }
	 	 }
	 	 catch(InterruptedException IE){
	 	 	 System.out.println("I am Interrupted");
	 	 }
	 }
	 public static void main(String[] args)throws InterruptedException {
	 	 threadInterrupt t1=new threadInterrupt();
	 	 t1.start();
	 	 t1.interrupt();
	 	 System.out.println("End Of Main Thread");
	 }
}
/*------------------interrupt never wasted-------------------------------*/
/*class threadInterrupt extends Thread{
	 
	 public void run(){
	 	 	 for(int i=1;i<=10;i++){
	 	 	 	System.out.println("I am Lazy Threda");
	 	 	 }
	 	 System.out.println("I want To sleep");
	 	 try{

              Thread.sleep(1000);
	 	 }
	 	 catch(InterruptedException IE){
	 	 	 System.out.println("I am Interrupted");
	 	 }
	 }
	 public static void main(String[] args)throws InterruptedException {
	 	 threadInterrupt t1=new threadInterrupt();
	 	 t1.start();
	 	 t1.interrupt();
	 	 System.out.println("End Of Main Thread");
	 }
}*/