class thread implements Runnable{
	 public void run(){
	 	 display1();
	 	 display2();
	 }
	 public synchronized void display1(){
	 	 for(int i=0;i<3;i++){
	 	 	System.out.println(Thread.currentThread().getName()+" in display1");
	    }
	}
	public synchronized void display2(){
	 	 for(int i=0;i<3;i++){
	 	 	System.out.println(Thread.currentThread().getName()+" in display2");
	    }
	}
}
class synchronizationDemo3{
	public static void main(String[] args) {
		thread th=new thread();
		Thread t1=new Thread(th,"A");
		Thread t2=new Thread(th,"B");
		t1.start();
		t2.start();
	}
}