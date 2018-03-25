class MyThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("run()");
		}
	}
}
class  Thread9
	{
	   public static void main(String[] x)throws InterruptedException
		{
		   MyThread t=new MyThread();
		    Thread th=new Thread(t);
		   th.start();
		   th.join();
		   for(int i=0;i<5;i++)
			{
			   System.out.println("main()");
			}
		}
	}