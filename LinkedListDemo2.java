import java.util.LinkedList;
import java.util.Iterator;
class LinkedListDemo2{
  public static void main(String[] args) {
  LinkedList list1=new LinkedList();
   list1.add(null);
   list1.add("shahnawaz");
   list1.addFirst('A');
   list1.addLast(null);
   System.out.println(list1);
   Iterator itr=list1.descendingIterator();
   for(int i=0;i<list1.size();i++){     
       System.out.println(itr.next());
     }
  }
}