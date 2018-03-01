class exit_method2
{
	void exception()
		{
		    try
		     {
			   System.out.println("Inside try block");
			   System.out.println(10/0);
		     }
		 catch(ArithmeticException e)
			 {
			  System.out.println("Exception is handled");
			  System.exit(0);
		    }
			finally
		  {
			 System.out.println("Inside finally block");
		  }
	}		
	public static void main(String[] x)
	  {
		     exit_method2 b=new exit_method2();
			 b.exception();
	  }
}