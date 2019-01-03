class thread extends Thread{
	int lock=0;
	 public void run(){
	 	  display();
	 }
   public void display(){
      synchronized(this){
      	lock++;
      	 A a=new A();
      	 synchronized(a){
      	 	lock++;
      	 	  B b=new B();
      	 	  synchronized(b){
      	 	  	lock++;
      	 	  	  C c=new C();
      	 	  	  synchronized(c){
      	 	  	  	lock++;
      	 	  	  	 D d=new D();
      	 	  	  	 synchronized(d){
      	 	  	  	 	lock++;
      	 	  	  	 	 E e=new E();
      	 	  	  	 	 synchronized(e){
      	 	  	  	 	 	 lock++;
      	 	  	  	 	 	 System.out.println("Total Lock="+lock);
      	 	  	  	 	 	 lock--;
      	 	  	  	 	  }
      	 	  	  	 	 System.out.println("Thread releasing Lock="+lock);
      	 	  	  	 	  lock--;
      	 	  	  	 }
      	 	  	  	 System.out.println("Thread releasing Lock="+lock); 
      	 	  	  	 lock--;
      	 	  	  }
      	 	  	  System.out.println("Thread releasing Lock="+lock);
      	 	  	  lock--;
      	 	  }
      	 	  System.out.println("Thread releasing Lock="+lock);
      	 	   lock--;
      	 }
      }
       System.out.println("Thread releasing Lock="+lock);
       lock--;

       System.out.println("Thread releas all Locks="+lock);
   }

}
class synchronizationDemo5{
	public static void main(String[] args) {
		Thread t1=new Thread(new thread());
		t1.start();
	}
}
class A{}
class B{}
class C{}
class D{}
class E{}