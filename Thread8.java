class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("run()");
		}
	}
}
class  Thread8
	{
	   public static void main(String[] x)throws InterruptedException
		{
		   MyThread t=new MyThread();
		   t.start();
		   t.join();
		   for(int i=0;i<5;i++)
			{
			   System.out.println("main()");
			}
		}
	}