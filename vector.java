import java.util.*;
class vector
{
	  public static void main(String...x){
            Vector v=new Vector(5,5);                 //First Argument for fixing initial capacity and Second Argument for incremental capacity
			                                                              //Incremented By 2*old capacity
																		  //By Default initia capacity is 10
			
			System.out.println("Initial Capacity="+v.capacity());
			for(int i=0;i<6;i++){
              v.addElement(i);                       //We Can Use v.add(i);
			}
	  System.out.println("Capacity="+v.capacity());
	  System.out.println(v);
	   v.add(v.size(),"shahnawaz");              //add element At specified Index
      System.out.println(v);
	  }
}