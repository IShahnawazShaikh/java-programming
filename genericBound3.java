class Shahnawaz{
}
interface Prolog{
}
class child1 extends Shahnawaz implements Prolog{
}
class child2 extends child1{
}
class child3 extends Shahnawaz{
}
class child4 implements Prolog{
}
class genericBound3<T extends Shahnawaz & Prolog>
{
	   T t;
	   void show(T t){
          this.t=t;
		  System.out.println(t.getClass().getName());
	   }
	  public static void main(String...x){
	       genericBound3 sh=new genericBound3();
		   sh.show(new Shahnawaz());    //Ok
		   sh.show(new child1());          // Ok
		   sh.show(new child2());        //Ok
		   sh.show(new child3());       //Ok
		 //  sh.show(new child4());      //child4 cannot be converted to Shahnawaz
	  }
}