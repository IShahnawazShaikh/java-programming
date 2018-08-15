class outerClass4
{
	    private int x=10;
       outerClass4(){
		   System.out.println("outer class constructor");
	   }
	    void method(outerClass4 obj){   
	    class localInnerClass
		   {       
			       private int x=11;
			       void display(){
					   int x=12;
				    System.out.println("value of x="+x);
					 System.out.println("value of x="+this.x);
					  System.out.println("value of x="+obj.x);
		       }
		   }

		   new localInnerClass().display();
		}
		public static void main(final String...g){
           outerClass4 oc=new outerClass4();
		   oc.method(oc);

		}
}