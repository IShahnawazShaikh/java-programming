import java.util.*;
class treeSet{
	 public static void main(String...x){

		  TreeSet TS=new TreeSet();
		  TS.add(5);
		  TS.add(10);
		  TS.add(0);
		  TS.add(11);
		  System.out.println(TS.add(10));        //Return False Duplication is not Allow
		  System.out.println(TS);
		/*  TS.add('c');                                        Give ClassCast Exception (heterogenous lements are not Allow)
		  System.out.println(TS);*/
 
          TreeSet TS2=new TreeSet();
		  TS2.add("shahnawaz");
		   TS2.add("Irfan");
		    TS2.add("Pasha");                               //Default Natural Sorting(Ascending)
			 TS2.add("Vishu");
			  TS2.add("Umar");
			   TS2.add("Kanoon");
			    TS2.add("Anas");
				 TS2.add("shahnawaz shaikh");
				 TS2.add("Arif");
				 System.out.println(TS2);

		  
	 }
}