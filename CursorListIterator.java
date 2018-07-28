import java.util.*;
class CursorListIterator
{
	   public static void main(String...x){
	        LinkedList list=new LinkedList();
            list.add("shahnawaz");
			list.add("pasha");
			list.add("Umar");
			list.add("Irfan");
			list.add("Vishu");
			System.out.println(list);
			ListIterator itr=list.listIterator();
			while(itr.hasNext()){
               String s=(String)itr.next();
			   if(s.equals("Umar"))
				   itr.remove();
				  else if(s.equals("shahnawaz"))
				        itr.add("ShahnawazShaikh");
			       else
				  itr.set("Mariya");
		}
		System.out.println(list);
		}
}