class Demo
{
	void doStuff(String str){
		System.out.println(str+" is outside of block");
		synchronized(this){
			for(int i=0;i<5;i++){
				System.out.println(str+" inside of block");
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException IE){}
		   }
		}
	}
}
class Thread1 extends Thread
{
	Demo ref;
	String str;
	Thread1(Demo d,String s){
		this.ref=d;
		str=s;
	}
	public void run(){
		ref.doStuff(str);
	}
}
class Thread2 extends Thread
{
	String str;
	Demo ref;
	Thread2(Demo d,String s){
		this.ref=d;
		str=s;
	}
	public void run(){
		ref.doStuff(str);
	}
}
public class SynchronizedDemo2
{
    public static void main(String[] x){
	 Demo d=new Demo();
	 Thread1 t1=new Thread1(d,"thread-1");
	 Thread2 t2=new Thread2(d,"thread-2");
	 t1.start();
	 t2.start();
	}
}