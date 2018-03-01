class finally_block
{
	void exception()
		{
		    try
		     {
			   System.out.println("Inside try block");
			   System.out.println(10/1);
			   return;
		     }
		 catch(ArithmeticException e)
			 {
			  System.out.println("Exception is handled");
		    }
			finally
		  {
			 System.out.println("Inside finally block");
		  }
	}		
	public static void main(String[] x)
	  {
		     finally_block b=new finally_block();
			 b.exception();
	  }
}