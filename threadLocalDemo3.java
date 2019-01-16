class thread extends Thread{
  String name;
  static int id=0;
  private static ThreadLocal tl=new ThreadLocal(){
     public String initialValue(){
     	  return ++id+"";
     }
  };
  thread(String name){
    this.name=name;
  }
  public void run(){
  	 System.out.println(Thread.currentThread().getName()+" Maintain Customer Id="+tl.get());
  }
}
class threadLocalDemo3{
	 public static void main(String[] args) {
	 	 thread t1=new thread("Thread-1");
	 	 thread t2=new thread("Thread-2");
	 	 thread t3=new thread("Thread-3");
	 	 thread t4=new thread("Thread-4");
         t1.start();
         t2.start();
         t3.start();
         t4.start();
	 }
}