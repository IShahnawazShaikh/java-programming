import java.util.*;
class CursorEnumeration
{
	   public static void main(String...x){
         Vector v=new Vector();
		 ArrayList ar=new ArrayList();
		 ar.add(1);
		 ar.add(2);
		 for(int i=0;i<10;i++){
		   v.addElement(i);
		 }
		 System.out.println(v);
		 Enumeration e=v.elements();
		 while(e.hasMoreElements()){
               Integer value=(Integer)e.nextElement();
			   if(value%2==0)
			   System.out.println(value);
		 }
	}
} 