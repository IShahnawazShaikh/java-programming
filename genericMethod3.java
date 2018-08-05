import java.util.ArrayList;
class genericMethod3{
	   void perform(ArrayList<Object>list){
                  	 list.add(null);
					list.add("shahnawaz");         
					list.add(10);
				   	System.out.println(list);
	   }
	   public static void main(String...x){
	       ArrayList list=new ArrayList();
		  genericMethod3 my=new genericMethod3();
		   list.add(10);
		   my.perform(list);
		   list.add(10.4f);
		   System.out.println(list);
	   }
}