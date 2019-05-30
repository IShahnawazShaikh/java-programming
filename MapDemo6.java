import java.util.WeakHashMap;

public class MapDemo6 {
  public static void main(String[] args) throws InterruptedException {
	  WeakHashMap Wmap=new WeakHashMap();
	  Dog d1=new Dog("A");
	  Dog d2=new Dog("B");
	  Dog d3=new Dog("C");
	  Wmap.put(d1,10);
	  Wmap.put(d2,11);
	  Wmap.put(d3,12);
	  System.out.println(Wmap);
	  d2=null;
	  Runtime.getRuntime().gc();
	  Thread.sleep(2000);
	  System.out.println(Wmap); 
	  
   }
}
class Dog{
	String name;
	Dog(String name){
		 this.name=name;
	}
	public String toString() {
		 return name;
	}
	public void finalize() {
		 System.out.println(this+" removed");
	}
}
