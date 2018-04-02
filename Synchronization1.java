class Account 
{
	 int Balance;
	 Account(int bal){
		 this.Balance=bal;
	}
	int getMoney()
	{
		return Balance;
	}
	void Withdraw(int x)
	{
		Balance-=x;
	}
}
class Synchronization1  implements Runnable
{
	 Account acc=new Account(50);
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		 MakeWithdrawal(10);
		 if(acc.getMoney()<0)
			{
			    System.out.println("Money is Withdrawn");
			}
		}
	}
    private synchronized void MakeWithdrawal(int x)
	{
        if(acc.getMoney()>10)
		{
			 System.out.println(Thread.currentThread().getName()+" is Going to Withdraw Money");
			 try{
				 Thread.sleep(2000);
			 }
			 catch(InterruptedException e){
			 }
			 System.out.println(Thread.currentThread().getName()+" complete Withdraw");
			 acc.Withdraw(x);
			 System.out.println("Money left in bank  after "+Thread.currentThread().getName()+" withdrawal "+acc.getMoney());
		}
		else
		{
			System.out.println("Not enough money");
		}
	}
	public static void main(String[] c){
		Synchronization1 sn=new Synchronization1();
		Thread th1=new Thread(sn,"shahnawaz");
		Thread th2=new Thread(sn,"irfan");
		th1.start();
		th2.start();
	System.out.println("main Thread");
      }
}
