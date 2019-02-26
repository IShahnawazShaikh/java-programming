import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo4 {

	public static void main(String[] args) {
		Consumer<String> c1=s->System.out.println(s+" pursuing Computer engineering");
        c1.accept("Pasha");
		Consumer<String> c2=s->System.out.println(s+" Student od Jamia Millia Islamia");

		Consumer<String> c3=s->System.out.println(s+" Java is Favourite programming language");
		Consumer cm=c1.andThen(c2).andThen(c3);
		cm.accept("shahnawza");
		
		//OR
		Supplier<String> s=()->"shahnawaz";
		System.out.println(s.get());
		
		//BiPredicate p;
         //BiFunction f;
         //BiConsumer c;
		
		/*To Solve the Problem of autoBoxing and autounBoxing  */
		//IntPredicate p;
		//DoublePredicate p;
		//LongPredicate LP;
		//DoubleFunction d;
		//IntFunction IP;
		//LongFunction LP;
	   //DoubleToLongFunction l
		//DoubleToIntFunction
		//IntToDoubleFunction
		//LongToIntFunction
		  //LongToDoubleFunction
		//ToDoubleFunction
		 //ObjDoubleConsumer
		// UnaryOperator
		// IntUnaryOperator
		  //BinaryOperator
		//IntBinaryOperator
		
	}

}
