import java.io.*; 
import java.util.LinkedList; 
import java.util.ListIterator; 
  
public class LinkedListDemo3 { 
    public static void main(String args[]) 
    { 
        LinkedList<String> list = new LinkedList<String>(); 
        list.add("Jamia"); 
        list.add("Millia"); 
        list.add("Islamia"); 
        list.add("Central"); 
        list.add("University"); 
        System.out.println("LinkedList:" + list); 
          
        ListIterator list_Iter = list.listIterator(2); 
        System.out.println("The list is as follows:"); 
        while(list_Iter.hasNext()){ 
           System.out.println(list_Iter.next()); 
        } 
    }
}
    