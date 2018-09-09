class exceptionDemo6
{
	  void display(){
		  try{
			  System.out.println("try");
			  System.exit(0);          //when we want to never execute finally block.
		  }
		  catch(Exception e){
            System.out.println("catch-1");
                System.out.println("catch-2");
		  }
		  finally{
           System.out.println("finally");
		  }
	  }
	 public static void main(String...x){
      exceptionDemo6 D6=new exceptionDemo6();
      D6.display();
	 }
}