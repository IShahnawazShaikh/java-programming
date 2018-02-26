class ArrayIndex
{
	   void Error_Method(){
                  int array[]=new int[10];
					  try{
					  array[10]=90;
				   }
				   catch(ArrayIndexOutOfBoundsException a){
					System.out.println("Array index is out of Bound Exception");
				
					}
					finally{
						System.out.println("Clean-up code");
					  }
	     }
	 public static void main(String[] c)
	     {
			    ArrayIndex reference=new ArrayIndex();
				reference.Error_Method();
		 }
}