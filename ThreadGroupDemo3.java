class ThreadGroupDemo3 extends Thread{
	ThreadGroupDemo3(ThreadGroup g,String name){
		 super(g,name);
	}
	public void run(){
		  try{
		  	 Thread.sleep(1000);
		  }
		  catch(InterruptedException IE){}
		  System.out.println(Thread.currentThread().getName());
	}
	 public static void main(String[] args) throws InterruptedException{
	    ThreadGroup pg=new ThreadGroup("Parent Group");	
	    ThreadGroup cg=new ThreadGroup(pg,"Child Group");
	    ThreadGroupDemo3 t1=new ThreadGroupDemo3(pg,"t1");
	    ThreadGroupDemo3 t2=new ThreadGroupDemo3(pg,"t2");
	    ThreadGroupDemo3 t3=new ThreadGroupDemo3(cg,"t3");
	    ThreadGroupDemo3 t4=new ThreadGroupDemo3(cg,"t4");
	    t1.start();
	    t2.start();
	    t3.start();
	    t4.start();
        System.out.println("Active Thread="+pg.activeCount());
        System.out.println("Active SubGroup="+pg.activeGroupCount());
	    pg.list();
	    Thread.sleep(1000);//Thread.sleep(1);
        System.out.println("Active Thread="+pg.activeCount());
        pg.list();
        System.out.println("Active SubGroup="+pg.activeGroupCount());
        cg.list();
	 }
}