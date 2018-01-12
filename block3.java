class  block3
{
	  block3()
	{
		  System.out.println("No argument constructor");
	}
	block3(int x)
	{
		System.out.println("one argument constructor");
	}
		
	{
		{
			{
	                 System.out.println("	1");	
   			}
                 System.out.println("2");		
		}
		System.out.println("understood nested init block");
	}
	{
		
		System.out.println("init block 2");
	}

	public static void main(String[] args) 
	{
		new block3(20);
		new block3();
	}
}