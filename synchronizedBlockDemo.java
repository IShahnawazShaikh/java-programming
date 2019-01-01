class thread extends Thread{
	  public void run(){
            
            display();
	  }
	  public void display(){
	  	  System.out.println(Thread.currentThread().getName()+" called Display");
	  	  synchronized(this){
	  	  	 for(int i=0;i<3;i++){
	  	       System.out.println(Thread.currentThread().getName()+" executing synchronized block-"+(i+1));
	  	  	 }
	  	  }
	  }
}
class synchronizedBlockDemo{
   public static void main(String[] args) {
   	   thread th=new thread();
       Thread t1=new Thread(th,"Thread-1 ");
       Thread t2=new Thread(th,"Thread-2 ");
       Thread t3=new Thread(th,"Thread-3 ");
       t1.start();
       t2.start();
       t3.start();
   }

}