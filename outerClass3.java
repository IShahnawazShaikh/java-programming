class outerClass3
{
	   private int x=9;
	 class inner1
	 {  
		  private int x=10; 
		  int display(outerClass3 obj){
         System.out.println(obj.x);
		 return 1 ;
		  }	  
	 }
	 class inner2
	 {
		   inner2(outerClass3 obj){
          inner1 In1= new inner1();
		  In1.display(obj);
		   System.out.println(In1.x);
		   }
	 }
	 public static void main(String...x){
        outerClass3 oc=new outerClass3();
		outerClass3.inner2 In2=oc.new inner2(oc);

	 }
}