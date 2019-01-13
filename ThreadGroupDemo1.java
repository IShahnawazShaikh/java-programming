class ThreadGroupDemo1{
	 public static void main(String[] args) {
	   System.out.println("Name of Main Thread->"+Thread.currentThread().getName());
	   System.out.println("Main Thread belong to Group->"+Thread.currentThread().getThreadGroup().getName());
	   System.out.println("Parent Of Main Thread->"+Thread.currentThread().getThreadGroup().getParent().getName());
	 }
}