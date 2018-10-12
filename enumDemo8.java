class enumDemo8{
enum Pen{   
     A(7),B(10),C(15), D;   
    private int value;  
    private Pen(int value){  
    this.value=value;  
   }  
 private Pen(){
    this.value=50;
 }
 int show(){
    return value;
   }
  
}  
    public static void main(String args[]){  
    for (Pen p : Pen.values())  
    System.out.println("Cost of Pen "+p+"="+p.show());  
     
	}

}
      