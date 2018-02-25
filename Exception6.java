class Exception6
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
				finally{
					System.out.println("Clean up code");
					System.out.println("It is always executed");
				}
	   }
	public static void main(String[] args) 
	{
		 Exception6 E =new Exception6();
		 E.exception();
		 System.out.println("Inside main");

	}
}
