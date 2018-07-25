class parent
{
	   parent(){
          System.out.println("In Parent Constructor");
	 }
	  {
	    System.out.println("parent init block");
	  }
	  static{
       System.out.println("parent stati init blok");
  }
}
class child extends parent
{
	    child(){
		 System.out.println("child constructor");
	}
 static{
       System.out.println("chil stati init blok");
  }
	  {
	       System.out.println("child init block");
	  }
	    public static void main(String []a){
              new child();

			  new child();
		}
}