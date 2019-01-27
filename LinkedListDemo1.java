import java.util.LinkedList;
class LinkedListDemo1{
  public static void main(String[] args) {
  LinkedList list1=new LinkedList();
   list1.add(null);
   list1.add("shahnawaz");
   list1.addFirst('A');
   list1.addLast(null);
   LinkedList list2=new LinkedList();

   list2=(LinkedList)list1.clone();  
   //list2=list1;
   list1.add("after");
   System.out.println(list1);
   System.out.println(list2);
   list2.add('M');
   System.out.println(list1);
   System.out.println(list2);
  }
}