class Exception3 
{

	  void exception()
	   {
		    System.out.println("inside exception-1");
		
		    try{
				     System.out.println(10/0);
			    }
				catch(ArithmeticException e |NullPointerException e |IllegalArgumentException e|){
					  System.out.println("Exception= "+e);
				}
				catch(Exception e)
		                    {
					   System.out.println("Exception");
				}
	   }
	public static void main(String[] args) 
	{
		 Exception3 E =new Exception3();
		 E.exception();
		 System.out.println("Inside main");

	}
}
