interface test{
	void display();
}
abstract class Abstract implements test{
   abstract void show();
}
class abstractDemo2 extends Abstract{
	void show(){
		 System.out.println("show");
	}
	public void display(){
		 System.out.println("display");
	}
	 public static void main(String[] args) {
	 	abstractDemo2 t=new abstractDemo2();
	 	t.show();
	 	t.display();
	 }
}