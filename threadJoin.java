class vanue extends Thread{
	 public void run(){
	 	 System.out.println("vanue");
	 }
}
class card extends Thread{
	vanue t1;
	card(vanue t1){
      this.t1=t1;
	}
	  public void run(){
	  	 try{
	  	 	//System.out.println("call t1.join");
	  	 	t1.join();
	  	 }
	  	 catch(InterruptedException IE){}
	 	 System.out.println("card");
	 }
}
class distribution extends Thread{
	  card t2;
	  distribution(card t2){
	  	this.t2=t2;
	  }
	  public void run(){
	  	try{
	  		//System.out.println("call t2.join");
	  	 	t2.join();
	  	 }
	  	 catch(InterruptedException IE){}
	 	 System.out.println("distributed");
	 }
}
class threadJoin{
	vanue t1=new vanue();
	card t2=new card(t1);
	distribution t3=new distribution(t2);
	void call(){
      t1.start();
      t2.start();
      t3.start();

	}
public static void main(String[] args){
	 	 threadJoin obj=new threadJoin();
	 	 obj.call();

	 }
}