class exceptionDemo2
{
     void exceptionInfromation(){
  
           try{
			   System.out.println(10/0);
		   }
		   catch(ArithmeticException e){
         
               System.out.println("Description using getMessage():"+e.getMessage());
			   System.out.println("Name and description of Exception using toString():"+e.toString());
               System.out.println("Name,description and Location of Exception using printStackTrace():");
			   e.printStackTrace(); 
		   }
	 }
	  public static void main(String...x){
         exceptionDemo2 D2=new exceptionDemo2();
		  D2.exceptionInfromation();
	  }
}