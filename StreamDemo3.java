import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo3 {

	public static void main(String[] args) {
		ArrayList <Integer>l1=new ArrayList<Integer>();
		 l1.add(20);l1.add(3);l1.add(5);l1.add(8);l1.add(12);l1.add(25);l1.add(3);l1.add(16);
	      System.out.println("before opeartion List:"+l1);
	      
	      /*traversing each element*/
	      Stream stream1=l1.stream();
	      stream1.forEach(System.out::println);   //Method reference
	       
	      /*OR*/
	      Consumer<Integer>c=value->{
	    	  System.out.println(value);
	      };
	      Stream stream2=l1.stream();
	      stream2.forEach(c); 
	      
	      /*OR*/
	      
	      Stream stream3=l1.stream();
	      stream3.forEach(value->{
	    	    System.out.println(value);
	    	  }); 
	      
	      
	      /*toArray()*/
	       Integer[] i=l1.stream().toArray(Integer[]::new);   //constructor refernec
	       System.out.println("Inetegr Array Of List using Stream");
	       for(Integer i1:i)
	    	    System.out.println(i1);
	       
	       /*Getting Stream of Array and print the elements of Array*/
	       System.out.println("Elements of Array Using forEach");
	       Stream.of(i).forEach(System.out::println);
	       
	      
			/*we can use stream for those value which not either array and collection*/
	        Stream s=Stream.of(1,11,111,1111,111);
	        s.forEach(System.out::println);
	       
	}

}
