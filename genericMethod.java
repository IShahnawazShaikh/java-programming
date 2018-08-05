import java.util.ArrayList;
class genericMethod{
	   void perform(ArrayList<String>list){
                   list.add("Shahnawaz");
				   list.add("Pasha");
				   list.add("Irfan");
				   list.add("Arif");
                 //list.add(10);         CompileTimeError
				 list.add(null);
				   	System.out.println(list);
	   }
	   public static void main(String...x){
	       ArrayList list=new ArrayList();
		  genericMethod my=new genericMethod();
		   list.add(10);
		   my.perform(list);
		   list.add(10.4f);
		   System.out.println(list);
		   	System.out.println(list.get(4));
	   }
}