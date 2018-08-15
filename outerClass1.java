class outerClass1
{
	  private int value=10;
	   class inner
	   { 
		      private int value=11;
		      void innerMethod(outerClass1 obj){
                  System.out.println(value);                      //Accessing InnerClass private dataMember
				    System.out.println(obj.value);            //Accessing OuterClass Private dataMember
			  }
			   void innerMethod(){
                  System.out.println(value);                      //Accessing InnerClass private dataMember
			  }
	   }
	   public static void main(String...x){
		  outerClass1 outer=new outerClass1();
			  outer.new inner().innerMethod(outer);
			  outerClass1.inner in=outer.new inner();              //Instantiating member of inner class from outside
			  in.innerMethod();

	   }
}