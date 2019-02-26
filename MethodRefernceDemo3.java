@FunctionalInterface
interface ReferneceDemo{
	void print(int x);
}
public class MethodRefernceDemo3 {

	 public static int show(int x){
		 System.out.println("show "+x);
		 return 10;
	 }
	public static void main(String[] args) {
		ReferneceDemo demo= MethodRefernceDemo3::show;
		demo.print(10);
	}  

}
