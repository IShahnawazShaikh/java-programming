/*---------REMOVE DUPLICATE FROM ARRAYLIST-------------*/
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
class removeDuplicateArrayList{
	 public static void main(String[] args) {
	 	ArrayList <Integer> al=new ArrayList<Integer>();
	 	al.add(1);
	 	al.add(2);
	 	al.add(3);
	 	al.add(3);
	 	al.add(4);
        System.out.println("Before clear List "+al);
	 	Set hs=new LinkedHashSet(al);
	 	al.clear();
	 	al.addAll(hs);
	 	System.out.println("After remove duplicate "+al);
	 	hs=null;

	 }
}

