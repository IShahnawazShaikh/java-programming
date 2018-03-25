class MyThread1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("run()-1");
		}
	}
}
class MyThread2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("run()-2");
		}
	}
}
class  Thread10
	{
	   public static void main(String[] x)throws InterruptedException
		{
		   MyThread1 t1=new MyThread1();
		   MyThread2 t2=new MyThread2();
		   Thread th1=new Thread(t1);
		    Thread th2=new Thread(t2);
		   th1.start();
		   th2.start();
		   th1.join();
		   th2.join();             //t2 Thread execute First as it join last.
		   for(int i=0;i<10;i++)
			{
			   System.out.println("main()");
			}
		}
	}