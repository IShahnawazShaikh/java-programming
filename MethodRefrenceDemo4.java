class constructorClass{
	constructorClass(String s){
		System.out.println("constructor");
	}
}
@FunctionalInterface
interface myInterface{
	public constructorClass get(String s);
}
public class MethodRefrenceDemo4 {

	public static void main(String[] args) {
		myInterface my=constructorClass::new;
		constructorClass obj1=my.get("A");
		constructorClass obj2=my.get("B");
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
