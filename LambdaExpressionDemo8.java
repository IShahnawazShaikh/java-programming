interface A{
	default void show1(){
		System.out.println("interface-A show1 method");
	}
}
interface B{
	default void show1(){
		System.out.println("interface-B show1 method");
	}
}
class LambdaExpressionDemo8 implements A,B{

     public void show1(){
     	 System.out.println("my m1 method");
     	 A.super.show1();
     	 B.super.show1();
     }
	 public static void main(String[] args) {
	 	 LambdaExpressionDemo8 obj=new LambdaExpressionDemo8();
	 	 obj.show1();
	 }
}