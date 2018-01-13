class block4
{
	block4()
	{
		System.out.println("no argument constructor");
	}
	block4(int x)
	{
		System.out.println("One argument cons");
	}
	static
	{
        
		     System.out.println("static inilt block-1");
	
		   
	}
	static
	{
		
		   
		System.out.println("static init block-2");
		 
	}
	{
		System.out.println("Non static init block-1");
	}
	{
		System.out.println("non static init block-2");
	}
	public static void main(String[] ar) 
	{
		new block4();
		new block4(20);
	}
}
