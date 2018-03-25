class MyThreading extends Thread
{
	public void run()
	{
		Thread.currentThread().setName("My Thread");
		for(int i=0;i<5;i++)
		{
		   System.out.println(Thread.currentThread().getName());
		}
	}
}
class Thread4
{
	public static void main(String[] x)
	{
		MyThreading th=new MyThreading();
		th.start();
		Thread.currentThread().setName("main_shahnawaz");
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
    }
}
