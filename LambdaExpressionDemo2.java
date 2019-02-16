@FunctionalInterface
interface test{
	int getLength(String s);
	default void display(){
		System.out.println("in display");
	}
	static void show(){
		 System.out.println("in show");
	}
}
class LambdaExpressionDemo2{
	public static void main(String...x){
		 //test t1=(s)-> s.length();
		 test t1=(s)->{
			 return s.length();
			};
		 System.out.println(t1.getLength("shahnawaz shaikh"));
		 t1.display();
		 test.show();
	}
}