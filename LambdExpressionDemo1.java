@FunctionalInterface
interface Test1{
	 void sum(int a,int b);	 
}
@FunctionalInterface
interface Test2 extends Test1{
	
}
public class LambdExpressionDemo1 {

	public static void main(String[] args) {
		Test1 t1=(a,b)-> System.out.println("Sum of "+a+" and "+b+" = "+(a+b));
		Test2 t2=(a,b)-> System.out.println(a*b);
         t1.sum(2,5);
         t1.sum(10,5);
         t2.sum(10,10);
	}
}
