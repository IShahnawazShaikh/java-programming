import java.util.concurrent.locks.*;
class threadReentrantDemo1{
	 public static void main(String[] args) {
	 	ReentrantLock l=new ReentrantLock();
	 	// l.lock();
	 	// l.lock();
	 	System.out.println(l.isLocked());
	 	System.out.println(l.isHeldByCurrentThread());
	 	System.out.println("Waiting Thread "+l.getQueueLength());
	 	System.out.println("Hold count "+l.getHoldCount());
	 	l.unlock();
	 	System.out.println("Hold count "+l.getHoldCount());
	 	System.out.println(l.isLocked());
	 	l.unlock();
	 	System.out.println("Hold count "+l.getHoldCount());
	 	System.out.println(l.isLocked());
	 	System.out.println(l.isFair());

	 }
}