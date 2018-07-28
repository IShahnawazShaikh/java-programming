import java.util.*;
class CursorIterator
  {       
	public static void main(String...x){
		   LinkedList list=new LinkedList();
		   list.add(1);
		   list.add(2);
		   list.add(3);
		   list.add(4);
		   list.add(5);
		   System.out.println(list);
		   Iterator itr=list.iterator();
		   while(itr.hasNext()){
		            Integer value=(Integer)itr.next();
					if(value%2!=0){
                      itr.remove();
					}
		   }
		   System.out.println(list);

	   }
}