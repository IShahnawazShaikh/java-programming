import java.util.Stack;
class newYear{
	 int year=2019;
	  int day=1;
	  public void newYearWish(){
        Stack st=new Stack();
        if(day==1 && year==2019){
         System.out.println("Happy New Year");
       }
       while(year!=2020){ 
                st.push("Happiness");
        st.push("Freedom");
        st.push("Prosperity");
        st.push("Joy");
        st.push("Love");
        if(day==365){
        	 year=2020;
        }
        day++;
       }
       System.out.println(day-1);
	  }
	 public static void main(String[] args) {
	 	   new newYear().newYearWish();
	 }
}