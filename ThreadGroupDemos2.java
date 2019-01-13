class ThreadGroupDemo2{
	 public static void main(String[] args) {
	 	ThreadGroup g1=new ThreadGroup("Group-A");
	 	//System.out.println(g1.getMaxPriority());
	 	Thread t1=new Thread(g1,"First-thread");
	 	Thread t2=new Thread(g1,"Second-thread");
	 	g1.setMaxPriority(3);
	 	Thread t3=new Thread(g1,"Three-thread");
	 	System.out.println(t1.getPriority());
	 	System.out.println(t2.getPriority());
	 	System.out.println(t3.getPriority());
	 	//System.out.println(g1.getMaxPriority());
	 }
}