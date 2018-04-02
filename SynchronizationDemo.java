class Demo
{
	public void help(String str){
         Synchronized1(str);
	}
	 private synchronized void Synchronized1(String str)	{
		 for(int i=0;i<5;i++){
	     System.out.println(str+" In first Synchronized method");
		 try{
			 Thread.sleep(2000);
		 }
		 catch(InterruptedException IE){
		 }
		 }
		 Synchronized2(str);
	}
 private synchronized void Synchronized2(String str){
	for(int i=0;i<5;i++){
	     System.out.println(str+" In second Synchronized method");
	 }
  }
}
class SynchronizationDemo extends Thread{
	 Demo ref;
	 String str;
   SynchronizationDemo(Demo d,String s){
	    this.ref=d;
		this.str=s;
	}
	public void run(){
		ref.help(str);
	}

	public static void main(String[] x){
	   Demo d=new Demo();
       SynchronizationDemo ref1=new SynchronizationDemo(d,"THREAD-1");
      SynchronizationDemo ref2=new SynchronizationDemo(d,"THREAD-2");
	  ref1.start();
	  ref2.start();
	}

}
