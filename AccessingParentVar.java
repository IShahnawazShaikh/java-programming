class GrandGrandParent
{
	 int x=14;
}
class Gparent extends GrandGrandParent
{
	  int x=13;
}
class parent extends Gparent
{
       int x=12;
	   void show(){
        System.out.println("shahnawaz");
	   }
}
class child extends parent{
	 int x=11;
	 void show(){
		 int x=10;
		 System.out.println(x);
		 System.out.println(this.x);
		  System.out.println(super.x);
		    System.out.println(((Gparent)this).x);
			 System.out.println(((GrandGrandParent)this).x);
			   
	 }
	  public static void main(String...x){
		     child c=new child();
			 c.show();
	  }
}