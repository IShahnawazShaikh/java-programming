enum Month{
  JAN,FEB,MAR;
  static int x=0;
  private Month(){   
	   this(10);
	   System.out.println("default constructor of object="+this); 
    }
 private Month(int x){
	   this.display(); 
      System.out.println("Argument constructor of object="+this);
  }
  public void display(){
	  x++;
      System.out.println("In display iterate="+x);
  }
}
class  enumDemo7
{
	 public static void main(String...x){
		Month[] m=Month.values();    //Must use Month functionality to load enum.
	   for(Month m1: m) 
	 System.out.println(m1);    
	   System.out.println("In enumDemo-class");
	}
}