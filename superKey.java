class parent
{   
	  int x=10;
	 parent(){
     System.out.println("Parent constructor");
	 }
	 void displayParent(){
          System.out.println("Parent Display");
	 }

	 void test(){
		 System.out.println("Parent test");
        }
}
class superKey extends parent
{ 
	   int x=11;
	   superKey(){
         super();         //used to call parent constructor
          System.out.println("Child constructor");
	   }
	{
	   super.test();                 //When we want to execute same method which will be override by the child.   
	 }
	void displayParentInstance(){
	     System.out.println("child value x="+this.x);
		 System.out.println("child value x="+super.x);        //refer parent instance
	}
	 void displaychild(){
	     System.out.println("Child Display");
	      super.displayParent();         //used to display parent methods 
	  }
	  	 void test(){
		 System.out.println("child test");
   }
	 public static void main(String...x){
          superKey sk=new superKey();
		  sk.displaychild();
		  sk.test();
		  sk.displayParentInstance();
	  }
}