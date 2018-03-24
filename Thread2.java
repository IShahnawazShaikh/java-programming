class MyThreading extends Thread 
{
	public void start()
	{
		super.start();
	}
    public void run()
	{
		 
		  for(int i=0;i<10;i++)
		  System.out.println("run()");
	}
}
class Thread2
{
	public static void main(String[] c)
	{
		MyThreading t=new MyThreading();
		t.start();
		int i;
		for(i=0;i<10;i++)
		System.out.println("mian()");
	}
}
