interface A{
	public static void show1(){
		System.out.println("public static ");
	}
}
class LambdaExpressionDemo9 implements A{
	public static void main(String[] args) {
		A.show1();
	    A t=new LambdaExpression9();
	    A.show1();
	}
}