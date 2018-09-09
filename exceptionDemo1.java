//Showing how Exception is raised
class exceptionDemo1
{
	  void method1(){
	      this.method2();
		  System.out.println("In method-1");
	  }
   void method2(){
	   this.method3();
      System.out.println("In method-2");
   }
   
   void method3(){
	        System.out.println(10/0);
	         System.out.println("In method-3");
   }
	   public static void main(String...x){
           exceptionDemo1 D1=new exceptionDemo1();
		   
		   /*  try{
				 D1.method1();
			  }
			   catch(ArithmeticException e){	 
			    }
		*/
	   }
}

/*     Exception in thread "main" java.lang.ArithmeticException:  ----> Name of the Exception
          / by zero        ---> Description of the exception
		   
		             //Stack Trace
        at exceptionDemo1.method3(exceptionDemo1.java:13)   ---->Location of the Exception.
        at exceptionDemo1.method2(exceptionDemo1.java:8)
        at exceptionDemo1.method1(exceptionDemo1.java:4)
         at exceptionDemo1.main(exceptionDemo1.java:18)
		*/