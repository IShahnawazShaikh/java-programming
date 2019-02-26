import java.util.function.Function;

public class FunctionalInterfaceDemo3 {

	public static void main(String[] args) {
		 Function<Integer,Integer> f1=area->area*45;
		 Function<Integer,Integer> f2=side->side*side;
		System.out.println(f1.compose(f2).apply(40)); //72,000 first executed f2.apply(40) an then result is send by f1.apply(result)
		System.out.println(f1.andThen(f2).apply(40));	//opposite of compose
		System.out.println(Function.identity().apply(10));  //10
	}

}
