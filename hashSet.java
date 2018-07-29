import java.util.*;
class hashSet
{
	 public static void main(String...x){
          HashSet hs=new HashSet(16,1.0f);
		  hs.add('a');
          hs.add('b');
          hs.add('c');
         hs.add('d');
		 System.out.println(hs.add('d'));           //Return false beacuse duplication is not allowed
		 System.out.println(hs);
		 
	 }
}