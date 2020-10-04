class Thread1
{
	public static void main(String[] c)
	{
        
		// Using Java 8 Multithreading
        Thread thread = new Thread(()->{
             for(int i=0;i<10;i++)
		  System.out.println("run()");
        });
        thread.start();
		int i;
		for(i=0;i<10;i++)
		System.out.println("mian()");
	}
}
