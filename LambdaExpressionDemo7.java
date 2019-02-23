interface A{
	default void m1(){
		 System.out.println("default");
	}
}
class LambdaExpressionDemo7 implements A
{
	public void m1(){
		 System.out.println("overrided default");
	} 
	public static void main(String[] args) {
		LambdaExpressionDemo7 obj=new LambdaExpressionDemo7();
		obj.m1();
	}
}