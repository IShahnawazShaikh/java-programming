import java.util.*;
class stack
{
	  public static void main(String...x){
     Stack s=new Stack();
	 s.push('a');
	 s.push('b');
	 s.push("shahnawaz");
	 s.push('d');
	 System.out.println("Elements In the Stack are:"+s);
	 s.pop();
    System.out.println("Elements in The Stack After Pop Operation"+s);
	Object o=s.peek();
	System.out.println("Object at the peek if the stack="+o);
	System.out.println(s.search("shahnawaz"));
	System.out.println("Stack Empty="+s.isEmpty());
	ArrayList ar=new ArrayList(s);
	System.out.println(ar);
	s.push('d');
	System.out.println(s);          //If We convert collection(stak) to any Other Collection(ArrayList) then It is copied to that Collection not Cut.
     
	  }
}