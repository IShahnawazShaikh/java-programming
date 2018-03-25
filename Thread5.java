class MyThreading extends Thread
{
	public void run()
	{
		MyThreading refrence=(MyThreading)Thread.currentThread();
		System.out.println("My thread-"+refrence);
	}
}
class Thread5
{
	public static void main(String[] x)
	{
		MyThreading th=new MyThreading();
		th.start();
		System.out.println("my reference-"+th);		
    }
}
