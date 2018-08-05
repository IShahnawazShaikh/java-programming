import java.util.ArrayList;

class Shahnawaz
{ 
}
class genericMethod2{
	   void perform(ArrayList<? extends Shahnawaz>list){
                  	 list.add(null);
					 //list.add(new Shahnawaz());           //Error we can add null only
				   	System.out.println(list);
	   }
	   public static void main(String...x){
	       ArrayList list=new ArrayList();
		  genericMethod2 my=new genericMethod2();
		   list.add(10);
		   list.add((new Shahnawaz()).getClass().getName());
		   my.perform(list);
		   list.add(10.4f);
		   System.out.println(list);
	   }
}