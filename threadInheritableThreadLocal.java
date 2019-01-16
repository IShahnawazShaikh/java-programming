class parentThread extends Thread{
 public static InheritableThreadLocal tl=new InheritableThreadLocal(){
 	  public Object childValue(Object value){
          return "shahnawaz2";
 	  }
 };
  public void run(){
  	tl.set("shahnawaz");
  	System.out.println("parentThread value = "+tl.get());
    System.out.println("Prant Thread started Child thred");
    childThread ch=new childThread();
     ch.start();
  }
}
class childThread extends Thread{
	 public void run(){
  	  System.out.println("childThread value="+parentThread.tl.get());
	 }
}
class threadInheritableThreadLocal{
  public static void main(String[] args) {
  	parentThread ph=new parentThread();
  	ph.start();
  }
}

/*----------Child Thread value will be null when we use ThreadLocal class-------------------*/
/*
class parentThread extends Thread{
 public static ThreadLocal tl=new ThreadLocal();
  public void run(){
  	tl.set("shahnawaz");
  	System.out.println("parentThread value="+tl.get());
    System.out.println("Prant Thread started Child thred");
    childThread ch=new childThread();
     ch.start();
  }
}
class childThread extends Thread{
	 public void run(){
  	  System.out.println("childThread value="+parentThread.tl.get());
	 }
}
class threadInheritableThreadLocal{
  public static void main(String[] args) {
  	parentThread ph=new parentThread();
  	ph.start();
  }
}
*/