import java.io.*; 
import java.util.Vector; 
import java.util.ArrayList; 
  
public class LinkedListDemo4 { 
    public static void main(String args[]) 
    { 
      
  
       Vector v=new Vector(3,17);
       System.out.println(v.capacity());
       v.add("A");
       v.add("A");
       v.add("A");
       System.out.println(v.capacity());
       v.add("A");
       //v.trimToSize();
       System.out.println(v.capacity());
        
    }
}
    