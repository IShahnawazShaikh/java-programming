class A extends Thread{
	 public void run(){
	 	 System.out.println(Thread.currentThread().getName());
	 }
}
class threadCount{
	 public static void main(String[] args) {
	 	Thread t1=new Thread(new A());
	 	Thread t2=new Thread(new A());
	 	Thread t3=new Thread(new A());
	 	Thread t4=new Thread(new A());
	 	Thread t5=new Thread(new A());
	 	Thread t6=new Thread(new A());
	 	Thread t7=new Thread(new A());
	 	t1.start();
	 	t2.start();
	 	t3.start();
	 	t4.start();
	 	t5.start();
	 	t6.start();
	 	t7.start();
	 	System.out.println(Thread.activeCount());
	 	System.out.println(Thread.currentThread().getName());
	 }
}