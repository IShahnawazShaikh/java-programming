class ThreadCommunicationDemo2{
	 public static void main(String[] args) {
	 	queue q=new queue();
	 	 consumer cm=new consumer(q);
	 	 producer pc=new producer(q);
	 	 cm.setName("consumerThread");
	 	 pc.setName("producerThread");
	 	 cm.start();
	 	 pc.start();
	 }
}
class queue{
	int item=0;
	  void add(){
         item=item+1;
	  }
}
class consumer extends Thread{
	queue q;
	consumer(queue q){
		this.q=q;
	}
	 public void run(){
	 	synchronized(q){
            if(q.item!=0){
            	 System.out.println("One item is consumed");
            	 q.item=q.item-1;
            }
            else{
            	 System.out.println("consumer is going to wait state");
            	 try{
            	 	q.wait();
            	 	System.out.println("Consumer got Notification");
            	 	System.out.println("item consumed "+q.item);
            	 	q.item=q.item-1;
            	 }
            	 catch(InterruptedException e){}
            }
	 	}

	 }
}
class producer extends Thread{
	queue q;
	producer(queue q){
		this.q=q;
	}
	 public void run(){
           synchronized(q){
           	  q.add();
           	  System.out.println("producer is going to notify");
           	  q.notify();
           }
	 } 
}