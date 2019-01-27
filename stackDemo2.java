import java.util.Stack;
class stackDemo2 implements Runnable
 {
 	 Stack s;
 	 stackDemo2(Stack s){
 	 	this.s=s;
 	 }
 	 public void run(){
 	 	 synchronized(this){
 	 	 	for(int i=1;i<=3;i++)
 	       System.out.println(Thread.currentThread().getName()+" POP an Element: "+s.pop());
 	  }
 	}
     public static void main(String[] args) {
	  Stack s=new Stack();
	   stackDemo2 obj= new stackDemo2(s);
	 	for(int i=1;i<10;i++){
	 		System.out.println(" Element is pushed is stack : "+ ('A'+i));
	 		s.push('A'+i);
	 	}
	 	Thread t1=new Thread(obj);
	 	Thread t2=new Thread(obj);
	 	Thread t3=new Thread(obj);
	 	t1.start();
	 	t2.start();
	 	t3.start();
	 }
}