import java.util.Arrays;
import java.util.List;

public class ArraysDemo1 {

	public static void main(String[] args) {
    String s[]= {"A","D","P","B","M"};
	  List l=Arrays.asList(s);
	  System.out.println("List :"+l);
	  for(String s1:s)
	  System.out.println(s1);
	  
	  l.set(2,"C");
	  System.out.println("After changing by List refernec:");
	  System.out.println("List :"+l);
	  for(String s1:s)
		  System.out.println(s1);
		s[0]="K";
		System.out.println("List :"+l);
		  for(String s1:s)
			  System.out.println(s1);
		//l.remove(0); UnsupportedReportedException
		//l.add("l");   UnsupportedReportedException
		//l.set(0, 3);   ArrayStoreException
	   
	}
}
