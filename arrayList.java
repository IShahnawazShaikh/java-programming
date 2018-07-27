import java.util.*;
class arrayList
{	 
    public static void main(String... abc){
       ArrayList ar=new ArrayList();
	   ar.add(30);                                    //add method
	   ar.add("shahnawaz");
	   ar.add(3);
	   ar.add('c');
	  System.out.println(ar);
	  ar.remove(3);                   //remove method
      System.out.println(ar);
	  ar.add(2,"pasha");                      //add at specified index
	  System.out.println(ar);
	  System.out.println("IndexOf Shahnawaz="+ar.indexOf("shahnawaz"));
	  ArrayList ar1=new ArrayList();               //new ArrayList Collection
	   ar1.add(30);
	   ar1.add("Pasha");
	   System.out.println(ar1);           //Display New Collection

	   ar.addAll((ar.size()),ar1);                     //Find Size of collection Having reference ar and add new Collection 
	     System.out.println("AfterAdding New Collection Objects Are:="+ar);                  
		 System.out.println(ar.indexOf(30));      //Finding First Index of 30.
	    System.out.println(ar.get(2));                      //Find value at Index 2.
	   System.out.println(ar.lastIndexOf(30));   //Finding Last Index of 30.      
	    System.out.println(ar.contains(30));           //Return true if object is contain else false
		System.out.println(ar.containsAll(ar1));
		 System.out.println("Before Repalce any Object="+ar);
         Object o=ar.set(2,"shahnawaz");
		  System.out.println("After Replacing the Object="+ar);
		  System.out.println(ar1);
		   System.out.println("Replaced Object is "+o);
         int size=ar.size();
	  Object my[]=ar.toArray();           //convert ArrayList Collection in Object Array
      for(int i=0;i<size;i++) {
				 System.out.println(my[i]);
  	  } 
	}
}