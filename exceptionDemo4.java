class exceptionDemo4
{
	   void display(){
		   int ar[]=new int[1];
        try{
         System.out.println(ar[2]);
		}
		catch(IndexOutOfBoundsException e){
	          try{
                   System.out.println(10/0);
			  }
			  catch(ArithmeticException e2){
			  }
			  finally{
                System.out.println("clean up-inside");
			  }
		  System.out.println("outsider catch");
		 }
		 finally{
			       try{}
				   catch(Exception e3){}
			       finally{
                           System.out.println("clean up-nested");          //if you want to execute nested finally then, you must Provide  try
				   }
                System.out.println("clean up-outside");
			  }
	   }
	  public static void main(String...x){
           exceptionDemo4 D4=new exceptionDemo4();
		   D4.display();
	  }
}