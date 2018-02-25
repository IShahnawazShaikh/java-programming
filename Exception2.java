class  Exception2
{
     void exception3()
	  {
		   System.out.println("inside exception-3");
		   System.out.println(10/0);
	  }

	 void exception2()
	   {
            this.exception3();
			 System.out.println("inside exception-2");
	   }
	 void exception1()
	  {
		  this.exception2();
		   System.out.println("inside exception-1");
	  }  
	public static void main(String[] args) 
	 { 
		Exception2 E=new Exception2();
		try{
	    	   E.exception1();
	    	}
		catch(ArithmeticException e)
		  {
			   System.out.println("Exception is handled by main");
		  }
	 }
}
