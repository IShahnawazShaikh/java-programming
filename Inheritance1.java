class Parent{
	 Parent(int var){
        System.out.println("Variable passed by child constructor "+var);
       System.out.println("Parent="+this);
	 }
}
public class Inheritance1 extends Parent{
	 Inheritance1(){
		 super(20);
       System.out.println("Child="+this);
	 }
	 public static void main(String...x){
         new Inheritance1();
	 }
}
