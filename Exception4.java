class Exception4 
{    
	void  exception1(){
		 try{
			     System.out.println(10/0);
		      }
           catch(ArithmeticException e){
			  System.out.println("Exception information are:-");
			    e.printStackTrace();
		    }
	}
	public static void main(String[] args) 
	{
		Exception4 E=new Exception4();
		E.exception1();
	}
}
