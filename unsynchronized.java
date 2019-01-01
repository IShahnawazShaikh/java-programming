class threadDemo implements Runnable{
	Account acc=new Account();
	  public void run(){
         for(int i=0;i<2;i++){
           try{
           	 Thread.sleep(1000);
               withdraw(10);
          }
          catch(InterruptedException e){}
        }
	  }
	  private void withdraw(int mn){
            if(acc.getBalance()>=mn){
         	System.out.println(Thread.currentThread().getName()+" Going to Withdraw");
            	 acc.makeWithdrawal(mn);
            }
            else{
            	 System.out.println(Thread.currentThread().getName()+" Sorry Not Enough Money");
            }
	  }
}

class SynchronizationDemoD1{
	 public static void main(String[] args) {
	 	    threadDemo t=new threadDemo();
	 	    Thread t1=new Thread(t,"shahnawaz");
	 	    Thread t2=new Thread(t,"shahbaz");
	 	    Thread t3=new Thread(t,"Irfan");
	 	    t1.start();
	 	    t2.start();
	 	    t3.start();
	 }
}
class Account{
	  float Balance=50.0f;
	  float getBalance(){
	  	 return Balance;
	  }
	 void makeWithdrawal(int with){
        Balance=Balance-with;
        System.out.println("After Withdrawal of "+Thread.currentThread().getName()+" MoneyLeft "+Balance);
	  }
}