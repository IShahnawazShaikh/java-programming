class  binary3
{
	int a,k;
	binary3()
	{
	     a=15;
		 k=4;
	}
	void cheack()
	{
	       a=a&(~(1<<(k-1)));     //unset at position k
		   
			   System.out.println(a);
          
	}
 public static void main(String[] x)
	{
	  
	      binary3 b=new binary3();
		  b.cheack();
	}
}
