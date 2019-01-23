interface A{
	 void display1();
	 int i=10;
}
interface B{
	 void display2();
}
interface C extends A,B{
	 void display3();
}
class interfaceDemo1 implements C{
	public void display1(){
		 System.out.println("display1"+i);
	}
	public void display2(){
	 System.out.println("display2");	 
	}
	public void display3(){
      System.out.println("display3");
	}
	 public static void main(String[] args) {
	 	interfaceDemo1 obj1=new interfaceDemo1();
	 	obj1.display1();
	 	obj1.display2();
	 	obj1.display3();
	 }
}
