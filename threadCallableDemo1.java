import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
class work implements Callable{
	int num,sum=0;
	work(int num){
		 this.num=num;
	}
	public Object call()throws Exception
   {   
       System.out.println(Thread.currentThread().getName()+" is responsible for sum of first"+num);
       for(int i=1;i<=num;i++){
         sum+=i;
       }
       System.out.println("work completed by: "+Thread.currentThread().getName());
       return sum;       //Implecit---->return Integer.valueOf(sum);
  }
}
class threadCallableDemo1 {
   public static void main(String[] args)throws Exception {
   	  work []job={new work(10),new work(20),new work(30),new work(40),new work(50),new work(60)};
   	  ExecutorService service=Executors.newFixedThreadPool(3);
   	  for(work j:job){
   	  	 Future r=service.submit(j);
         System.out.println(r.get());
   	  }
   	  service.shutdown();
   }
}