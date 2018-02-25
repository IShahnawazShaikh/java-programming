class Exception7
{

	  void exception()
	   {
		
		    try{
				     System.out.println(10/0);
			    }
				catch(ArithmeticException e){
					         try{
									   System.out.println(10/0);
								   }
								   catch(ArithmeticException Ae)
				                	{
									}
									finally{
										System.out.println("finally block-1");
									}
				}
				finally{
					System.out.println("finally block-2");			
				}
	   }
	public static void main(String[] args) 
	{
		 Exception7 E =new Exception7();
		 E.exception();
		 System.out.println("Inside main");

	}
}
