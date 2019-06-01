import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo1 {

	public static void main(String[] args) {
		CopyOnWriteArrayList l=new CopyOnWriteArrayList();
		l.add(1);
		l.add(1);
		System.out.println(l); // [1,1]
	    System.out.println(l.addIfAbsent(2)); //true
	    System.out.println(l);  // [1,1,2]
	    System.out.println(l.addIfAbsent(2));  //false
	    System.out.println(l); // [1,1,2]
	    
	    
	    
	    
	    	    
	    
	}

}
