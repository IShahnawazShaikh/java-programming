import java.util.ArrayList;
class removeDuplicateArrayList2{
	 public static void main(String[] args) {
	 	ArrayList <Integer>al=new ArrayList<Integer>();
	 	ArrayList <Integer>al2=new ArrayList<Integer>();
	    al.add(1);
	    al.add(2);
	    al.add(3);
	    al.add(3);
	    al.add(3);
	    al.add(4);
	    for(Object O: al){
	    	  if(!al2.contains(O)){
	    	  	 Integer obj=(Integer)O;
                  al2.add(obj);
	    	  }
	    }
        System.out.println("ArrayList with Duplicate Value "+al);
        System.out.println("Removed Duplicate Value "+al2);
        al=null;
	 }
}

