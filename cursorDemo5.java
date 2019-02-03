import java.util.ListIterator;
import java.util.ArrayList;
class cursorDemo5{
  public static void main(String[] args) {
  	ArrayList<Integer> al=new ArrayList<Integer>();
  	for(int i=1;i<=10;i++){
  		  al.add(i);
  	} 
  	System.out.println("Before any Operation List is: "+al);

  	ListIterator itr=al.listIterator();

  	while(itr.hasNext()){
   		 Integer element=(Integer)itr.next();
          
  		  System.out.println("Element is: "+element+" Previuos Index: "+itr.previousIndex()+" Next Index: "+(itr.nextIndex()));
 	    	  if(element%2==0){
 	   	  	  itr.remove();
 	   	  }
 	   	  if(element==7){
 	   	  	  itr.set("shahnawaz");
 	   	  }
  	}
  System.out.println("After Operation List is: "+al);
  }
}