class thread extends Thread{
	A a;B b;C c; D d; E e;F f;G g;H h;I i;
	thread(A a,B b,C c,D d,E e,F f,G g,H h,I i){
      this.a=a;
      this.b=b;
      this.c=c;
      this.d=d;
      this.e=e;
      this.f=f;
      this.g=g;
      this.h=h;
      this.i=i;
	}
	 public void run(){
	 	  display();
	 }
   private synchronized void display(){
      synchronized(this){
      	 synchronized(a){
      	 	  synchronized(b){
      	 	       synchronized(c){
      	 	  	  	 synchronized(d){
      	 	  	  	 	 synchronized(e){
      	 	  	  	 	 	  e.calculation();
                               System.out.println(Thread.currentThread().getName()+" having lock "+e+" give notification");
      	 	  	  	 	 	    this.notify();
                           synchronized(f){
                           	 synchronized(g){
                           	 	synchronized(h){
                           	 		synchronized(i){

                           	 		}
                           	 	}
                           	 }
                           }
      	 	  	  	 	 }
      	 	  	  	 }
      	 	  	  }
      	 	  }
      	 }
      }
   }


}
class synchronizationDemo4{
	public static void main(String[] args)throws InterruptedException {
		 A a=new A();
		 B b=new B();
		 C c=new C();
		 D d=new D();
		 E e=new E();
		 F f=new F();
		 G g=new G();
		 H h=new H();
		 I i=new I();
		Thread t1=new Thread(new thread(a,b,c,d,e,f,g,h,i));
		 t1.start();
		synchronized(e){
			System.out.println("Main is going to Waiting State");
			 e.wait(1000);
			 System.out.println("Main Got notification");
			 System.out.println("Answer= "+e.answer);
		}
	}
}
class E{
	int p=10000;
	float r=2.5f;
	float t=3.0f;
	float answer=0.0f;
   void calculation(){
    answer=((p*r*t)/100);
   }	 
}
class A{}
class B{}
class C{}
class D{}
class F{}
class G{}
class H{}
class I{}