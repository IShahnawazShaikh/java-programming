//Implementation to show ConcurrentModification Exception
import java.util.ArrayList;
import java.util.Iterator;
public class ConcurrentDemo1 extends Thread {
	static ArrayList al;
	 public void run() {
		  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 System.out.println("child is modifying List");
	 al.add(6);
	
 }
	public static void main(String[] args) throws InterruptedException {
		ConcurrentDemo1 d=new ConcurrentDemo1();
		al=new ArrayList();
		for(int i=0;i<=5;i++)
			al.add(i);
		d.start();
		System.out.println("Main Thread Iterating");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			Thread.sleep(2000);
		}
	}

}
