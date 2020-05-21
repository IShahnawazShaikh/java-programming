import java.util.Scanner;
import java.util.*;
public class Registration{
public static void main(String...x){
	  new Thread(()->{
	     List list=new ArrayList();
		 List list2=new ArrayList();
        Map<String,Integer> map=new HashMap<String,Integer>();
	  Scanner sc=new Scanner(System.in);
	  int num=sc.nextInt();
	    while(num>0){
        String name=sc.next();
        if(list.contains(name)){
			 int count=map.get(name);
			   list2.add(name+""+count);
			    list.add(name+""+count);
				map.put(name+""+count,1);
			    count++;
			    map.put(name,count);
		}
		else{
           list.add(name);
		   map.put(name,1);
		   list2.add("OK");
		}
          num--;
		}
   num=0;
   while(i<list2.size()){
   System.out.println(list2.get(i));
        num++;
   }
	  }).start();
   }
}