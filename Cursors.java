import java.util.*;
class Cursors
{
	    public static void main(String...x){

			Vector v=new Vector();
			Enumeration e=v.elements();
             Iterator itr=v.iterator();
			 ListIterator itr2=v.listIterator();
			 System.out.println(e.getClass().getName());
			 System.out.println(itr.getClass().getName());
			 System.out.println(itr2.getClass().getName());
		}
}