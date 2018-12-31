import java.lang.*; 
class NewThread extends Thread { 
 NewThread(String name,ThreadGroup tgName){
   super(tgName,name);
 }	
public void run(){ 
		for (int i = 0; i < 2; i++) { 
			System.out.println(Thread.currentThread().getName()+" executed-"+(i+1));
		} 
	} 
} 
public class ThreadGroupDemo { 
	public static void main(String arg[]) { 
		ThreadGroup tg1= new ThreadGroup("group-A"); 
		ThreadGroup tg2= new ThreadGroup("group-B"); 
        NewThread t1=new NewThread("thread1",tg1);
        NewThread t2=new NewThread("thread2",tg1);
        NewThread t3=new NewThread("thread3",tg2);
        NewThread t4=new NewThread("thread4",tg2);
        NewThread t5=new NewThread("thread5",tg2);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		System.out.println("number of active thread: in "+tg1.getName()+" is "+tg1.activeCount()); 
		System.out.println("number of active thread:  in "+tg2.getName()+" is "+tg2.activeCount()); 
	} 
} 
