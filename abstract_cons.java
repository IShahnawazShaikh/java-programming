abstract class A
{
	A()
	   {
		  System.out.println("Abstraction class constructor-1");
	   }
	 abstract void function();
}
abstract class B extends A
 {
    B()
	    {
	      System.out.println("Abstraction class constructor-2");
        }
	abstract void function();
}
class abstract_cons extends B
 {
	abstract_cons()
    	{
	    	System.out.println("Concrete class constructor");
	   }
	 void function()
	    {
		   System.out.println("message:-Abstract class cannot be initiated");
	   }
	  public static void main(String[] x)
	    {
		      abstract_cons abs=new abstract_cons();
		     abs.function();
		}
 }