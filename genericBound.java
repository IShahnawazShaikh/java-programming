class Shahnawaz
{
	   
}
class child1 extends Shahnawaz
{

}
class child2 extends child1
{
	 
}

class genericBound<T extends Shahnawaz>
{
	   T t;
	   void show(T t){
          this.t=t;
		  System.out.println(t.getClass().getName());
	   }
	  public static void main(String...x){
	       genericBound<Shahnawaz> sh=new <Shahnawaz>genericBound();
		   sh.show(new Shahnawaz());
		   sh.show(new child1());
		   sh.show(new child2());
		   
	  }
}