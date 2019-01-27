import java.util.Stack;
class PushObject extends Thread{
	Stack s;
	int counter=1;
	boolean bool=true;
	PushObject(Stack s){
      this.s=s;
	}
	 public void run(){
        synchronized(this){
        	System.out.println(Thread.currentThread().getName()+" push an Element");
            s.push('A');
          System.out.println(Thread.currentThread().getName()+" Give Notification");
          this.notify();
        }
	 	 
	 }
}
class PopObject extends Thread{
	 Stack s;
	 boolean bool=true;
	 int counter=1;
	PopObject(Stack s){
      this.s=s;
	}
	 public void run(){
        synchronized(this){
          if(s.empty()){
          	System.out.println(Thread.currentThread().getName()+" Going to waiting state");
          	 try{
          	 	this.wait(1000);
          	}
          	catch(Exception e){}
          	System.out.println(Thread.currentThread().getName()+" Got Notification");
          	System.out.println("pop Elemnts is: "+s.pop());
          }
       }
	 }
}
class stackDemo1{
   public static void main(String[] args) throws InterruptedException{
   	 Stack s=new Stack();
   	 PushObject push=new PushObject(s);
   	 PopObject pop=new PopObject(s);
     
      push.start();
      
      pop.start();


   }
}