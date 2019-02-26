public class MethodRefrenceDemo1 {
	public static void main(String[] args) {
      
		//Runnable r=myClass::show2;  //referring show2 method
		Thread t=new Thread(myClass::show2); 
		t.start();
		for(int i=0;i<3;i++)
			System.out.println(Thread.currentThread().getName());	
	}
}
class myClass{
	public static void show2(){    //only public and default modifier but if we declare show2() is in same class then public, private and default is applicable
		for(int i=0;i<3;i++)
		System.out.println(Thread.currentThread().getName()+" show-2");
		
	}
}
