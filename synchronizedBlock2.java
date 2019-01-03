class myThread extends Thread{
	 display d;
	 String name;
	 myThread(display d,String name){
        this.d=d;
        this.name=name;
	 }
	 public void run(){
	 	d.wish(name);
	 } 
}

class display{
	  public void wish(String name){
	  	 //I lakh lines of code
	 	   synchronized(display.class){
	 	   	  for(int i=0;i<3;i++){
	 	   	  System.out.print("Good Morning:");
              try{
              	 Thread.sleep(100);
              }
              catch(Exception e){}
              System.out.println(name);
	 	   }
	 	}
	  }
}
class synchronizedBlock2{
	 public static void main(String[] args) {
	 	 display d1=new display();
	 	 display d2=new display();
	 	 myThread t1=new myThread(d1,"shahnawaz");
	 	 myThread t2=new myThread(d2,"Arif");
	 	 t1.start();
	 	 t2.start();
	 }
}