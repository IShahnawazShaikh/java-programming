import	java.util.*;
 public	class CursorDemo6
 { public static void main(String[]	args) {
     Vector	v= new Vector();
      Enumeration e = v.elements();
       Iterator itr1=v.iterator();
        ListIterator itr2=v.listIterator();
         System.out.println(e.getClass().getName());
          System.out.println(itr1.getClass().getName());
           System.out.println(itr2.getClass().getName());
            }
          }[]