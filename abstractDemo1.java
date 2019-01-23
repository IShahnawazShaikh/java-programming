abstract class parent{
	//abstract void display2();
	static{
		 System.out.println("static-block");
	}
	{
		 System.out.println("parent block");
	}
	parent(){
		 System.out.println("parent constructor");
	}
	 
}
class abstractDemo1 extends parent{
	abstractDemo1(){
		 System.out.println("child constructor");
	}
	static{
		 System.out.println("static child block");
	}
	{
		 System.out.println("child block");
	}
  public static void main(String[] args) {

  	abstractDemo1 d=new abstractDemo1();
  	abstractDemo1 d1=new abstractDemo1();
  	
  }
}