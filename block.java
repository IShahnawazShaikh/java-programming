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
		System.out.println("1 init");
	}
	{
		System.out.println("2 init");
	}

	public static void main(String[] args) 
	{
		new block();
		new block(20);
	}
}