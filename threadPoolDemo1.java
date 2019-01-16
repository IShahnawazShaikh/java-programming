import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
class work extends Thread{
	String name;
	work(String name){
		 this.name=name;
	}
	 public void run(){
       System.out.println(name+"-work started by: "+Thread.currentThread().getName());
       try{
       	 Thread.sleep(1000);
       }
       catch(InterruptedException ae){ae.printStackTrace();}
       System.out.println(name+"-work completed by: "+Thread.currentThread().getName());
	 }
}
class threadPoolDemo1{
   public static void main(String[] args) {
   	  work []job={new work("A"),new work("B"),new work("C"),new work("D"),new work("E"),new work("H")};
   	  ExecutorService service=Executors.newFixedThreadPool(3);
   	  for(work j:job){
   	  	 service.submit(j);
   	  }
   	  service.shutdown();
   }
}