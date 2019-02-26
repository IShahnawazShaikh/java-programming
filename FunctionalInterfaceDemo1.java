import java.util.function.Predicate;
public class FunctionalInterfaceDemo1 {

	public static void main(String[] args) {
		Predicate<Integer> p1=n->n%2==0;
		Predicate<Integer> p2=n->n>10;
	     System.out.println(p1.and(p2).test(30));  //true
	     System.out.println(p1.or(p2).test(4));  //true
	     System.out.println(p1.negate().test(30)); //false
	    System.out.println(p1.and(p2).negate().test(12));  //false
	     
	     
		
	}

}
