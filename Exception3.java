class Exception3 
{

	  void exception()
	   {
		    System.out.println("inside exception-1");
		
		    try{
				     System.out.println(10/0);
			    }
				catch(ArithmeticException e){
					  System.out.println("Arithmetic exception");
				}
				catch(NullPointerException n){
					System.out.println("Null pointer exception");
				}
				catch(IllegalArgumentException i)
		        {
					   System.out.println("Illegal argument exception");
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
