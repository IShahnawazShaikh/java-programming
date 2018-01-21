class  binary2
{
	int a,k;
	binary2()
	{
	     a=5;
		 k=2;
	}
	void cheack()
	{
	       a=a&(1<<(k-1));    //cheack set or unset
		if(a==0)
                 {   
                     System.out.println("unset");
                 }
              else
                 {
                     System.out.println("Set");
                   }
          
	}
 public static void main(String[] x)
	{
	  
	      binary2 b=new binary2();
		  b.cheack();
	}
}
