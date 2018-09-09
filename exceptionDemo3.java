//Example of all exceptions
class exceptionDemo3
{
    void arithmeticException(){
         try{
			  System.out.println(10/0);
		 }
		 catch(ArithmeticException e){
                System.out.println("ArithmeticException");
		 }
 }
	void arrayIndexOutOfBoundsException(){
           int arr[]=new int[5];
		   try{
                 System.out.println(arr[5]);
		   }
		   catch(ArrayIndexOutOfBoundsException ar){
			   System.out.println("ArrayIndexOutOfBoundsException");
		   }
	}
 void numberFormatException(){
         String s="shahnawaz";
		 try{
			 int value=Integer.parseInt(s);
		 }
		 catch(NumberFormatException nm){
           System.out.println("NumberFormatException");
		 }
 }
 void stringIndexOutOfBoundException(){
    String str="beginnersbook";
	 System.out.println(str.length());
	 try{
		 char c = str.charAt(0);
	  System.out.println(c);
	  c = str.charAt(40);
	  System.out.println(c);
     }
	  catch(StringIndexOutOfBoundsException e){
	  System.out.println("StringIndexOutOfBoundsException");
      }
 }
void nullPointerException(){
        String str=null;
		try{
			System.out.println(str.length());
		}
		catch(NullPointerException ne){
		    System.out.println("NullPointerException");
		}
}
  public static void main(String...x){
              exceptionDemo3 D3=new exceptionDemo3();
			  D3.arithmeticException();
			  D3.arrayIndexOutOfBoundsException();
			  D3.numberFormatException();
			  D3.stringIndexOutOfBoundException();
			  D3.nullPointerException();
	  }
}