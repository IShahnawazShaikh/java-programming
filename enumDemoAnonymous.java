enum Day{
	SUN,MON{
	   void display(){
	      System.out.println("Inner Display method called by "+this);
	   }
	},TUES,WED{
	   void display(){
	      System.out.println("Inner Display method called by "+this);
	   }	
	};
    void display(){
      System.out.println("Display method called by "+this);
	}
}
public class enumDemoAnonymous
{
	 public static void main(String...c){
       // Day []d=Day.values();
        for(Day d1:Day.values()){
           d1.display();
		}
	 }
}
