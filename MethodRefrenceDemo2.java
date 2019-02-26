public class MethodRefrenceDemo2 {
	public static void main(String[] args) {
		Thread t=new Thread(new myClass2()::show2); 
		t.start();
		for(int i=0;i<3;i++)
			System.out.println(Thread.currentThread().getName());	
	}
}
class myClass2{
	public void show2(){    //only public and default modifier but if we declare show2() is in same class then public, private and default is applicable
		for(int i=0;i<3;i++)
		System.out.println(Thread.currentThread().getName()+" Show-2");
	}
}
