class exceptionDemo5
{
	  void display(){
		  try{
			  System.out.println("10");
			 return;
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
      exceptionDemo5 D5=new exceptionDemo5();
      D5.display();
	  System.out.println("After return");
	 }
}