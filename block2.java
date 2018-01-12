class  block
{
	  block()
	{
		  System.out.println("No argument constructor");
	}
	block(int x)
	{
		System.out.println("one argument constructor");
	}
		
	{
		int a=10,b=20,average;
		average=(a+b)/2;
		System.out.println("init block 1");
		System.out.println("average="+average);
	}
	{
		
		System.out.println("init block 2");
	}

	public static void main(String[] args) 
	{
		new block(20);
		new block();
	}
}