// Java code illustrating enumerate() method. 
import java.lang.*; 
class NewThread implements Runnable 
{ 
	
public void run() 
	{ 
      System.out.println(Thread.currentThread().getName()+" executed");
  } 
}
public class ThreadGroupDemo2
{ 
	public static void main(String arg[]) throws InterruptedException,SecurityException{ 

		ThreadGroup tg1= new ThreadGroup("group-A"); 
		ThreadGroup tg2= new ThreadGroup("Group-B"); 
		Thread t1 = new Thread(tg1,new NewThread(),"t1"); 
		Thread t2 = new Thread(tg1,new NewThread(),"t2"); 
		Thread t3 = new Thread(tg2,new NewThread(),"t3"); 
		Thread t4 = new Thread(tg2,new NewThread(),"t4"); 
		Thread t5 = new Thread(tg2,new NewThread(),"t5"); 
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		// System.out.println("activeCount()-"+tg1.activeCount());
  //        System.out.println("activeGroupCount()-"+tg1.activeGroupCount());
		Thread[] group1 = new Thread[tg1.activeCount()]; 
		Thread[] group2 = new Thread[tg2.activeCount()]; 
		int count1 = tg1.enumerate(group1); 
		int count2 = tg2.enumerate(group2); 
		for (int i = 0; i < count1; i++){ 
			System.out.println("In "+tg1.getName()+" "+ group1[i].getName() + " found"); 
		} 
		for (int i = 0; i < count2; i++){ 
			System.out.println("In "+tg2.getName()+" "+ group2[i].getName() + " found"); 
		} 
	} 
} 
