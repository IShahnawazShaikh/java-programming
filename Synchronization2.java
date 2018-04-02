class Synchronization2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<3;i++){
	  	show();
		}
	}
	private synchronized void show()
	{
		System.out.println(Thread.currentThread().getName()+" show");
		show2();
	}
	private synchronized void show2()
	{
           System.out.println(Thread.currentThread().getName()+" show-2");
	}

	public static void main(String[] x)
	{
		Synchronization2 sn=new Synchronization2();
		Thread one=new Thread(sn,"First");
		Thread two=new Thread(sn,"Second");
		Thread three=new Thread(sn,"Third");
		one.start();
		two.start();
		//three.start();
   }
}