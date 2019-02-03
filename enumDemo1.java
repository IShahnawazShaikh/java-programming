enum Name{
	 shahnawaz,pasha,irfan,anas,arif,saquib,zesshan;
	 public String toString(){
    	 return "Prolog";
    }
    Name(){
    	System.out.println("cons");
    }
}
class enumDemo1{

     public static void main(String[] args) {
     	 Name m=Name.shahnawaz;
     	  System.out.println(m);
     	  System.out.println(m.toString());
     	System.out.println("main");
     }
}