class ThreadDemo1 extends Thread
{
	public void run()
	{
		System.out.println("1");
	}
}
class ThreadDemo2 extends Thread
{
	public void run()
	{
		System.out.println("2");
	}
}
class ThreadDemo3 extends Thread
{
	public void run()
	{
		System.out.println("3");
	}
}
class Thread7
{
	public static void main(String[] c)
	{
	ThreadDemo1 d1=new ThreadDemo1();
	ThreadDemo2 d2=new ThreadDemo2();
	ThreadDemo3 d3=new ThreadDemo3();
	d1.setPriority(10);
	d2.setPriority(1);
	d1.start();
     d2.start();
	 d3.start();
	 System.out.println("main()");
   }
}

