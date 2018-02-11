abstract class A
{
	 abstract void function();
	 void show()
	  {
		  System.out.println("Abstract class can have abstract method");
	  }	
}
class abstract_3 extends A
 {
	 void function()
	    {
		   System.out.println("message:-Abstract class cannot be initiated");
	   }
	  public static void main(String[] x)
	    {
		      abstract_3 abs=new abstract_3();
		     abs.function();
			 abs.show();
		}
 }