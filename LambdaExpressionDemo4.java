@FunctionalInterface
interface cubeOperation{
	void cube(int a);
}
@FunctionalInterface
interface squareOperation{
	void square(int a);
}
public class LambdaExpressionDemo4 {
  public static void main(String...x){
	  cubeThread th1=new cubeThread();
	  squareThread th2=new squareThread();
	  Thread t2=new Thread(th2);
	  Thread t1=new Thread(th1);
	  t2.start();
	  t1.start();
  } 
}
class cubeThread implements Runnable{
	cubeOperation t1=(i)-> System.out.println(i*i*i);
	public void run(){
		for(int i=1;i<=5;i++){ 
		  System.out.print(Thread.currentThread().getName()+" calculate Cube of "+i+"=");
		   t1.cube(i);
		}
	}
}
class squareThread implements Runnable{
	squareOperation t1=(i)-> System.out.println(i*i);
	public void run(){
		for(int i=1;i<=5;i++){ 
		 System.out.print(Thread.currentThread().getName()+" calculate square of "+i+"=");
		   t1.square(i);
		}
	}
}
