class MyThreading extends Thread 
{
      public void run()
	{
		  int i;
		  for(i=0;i<10;i++)
		  System.out.println("run()");
	}
}
class Thread1
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
