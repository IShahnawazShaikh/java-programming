import java.util.*;
class linkList
{
	  public static void main(String...p){
		  LinkedList li=new LinkedList();
		  li.add(1);
		  li.add(10);
		  li.add(100);
		  li.add("shahnawaz");
		  li.addFirst("Irfan");
		  System.out.println(li);
         li.addLast(13);
		 System.out.println(li);
		  System.out.println("First Object In the Linked List is:"+li.getFirst());
		 System.out.println("Last Object In the Linked List is:"+li.getLast());
		 li.removeFirst();
		 System.out.println("After remove First:"+li);
		  li.removeLast();
		  System.out.println("After remove Last"+li);

		  //Making ArrayList Collection To make LinkedList Collection
		  ArrayList ar=new ArrayList();
		  ar.add("Shahnawaz");
		   ar.add("Irfan");
		    ar.add("Umar");
			 ar.add("Vishu");
			  ar.add("Pasha");
			   ar.add("Kanoon");
			  LinkedList li2=new LinkedList(ar);             //Equuivalent Linked Collection
			  System.out.println("Converted LinkedList objects are:"+li2);
			  li2.addFirst("Mariya Kahanam");
			  System.out.println(li2);
			   System.out.println(li2.size());
            


	  }
}