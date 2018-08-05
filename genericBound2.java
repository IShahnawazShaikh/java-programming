class genericBound2<T extends Number>
{
	   T t;
	   void show(T t){
          this.t=t;
		  System.out.println(t.getClass().getName());
	   }
	  public static void main(String...x){
	       genericBound2<Number>b=new <Number>genericBound2();
		   b.show(10);
		   b.show(10.7f);
		   b.show(10.7);
		//   b.show('c');          character cannot be convertesd to Number
		   
	  }
}