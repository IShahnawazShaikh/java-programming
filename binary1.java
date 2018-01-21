class  binary1
{
	int a;
	binary1()
	{
	     a=10;
	}
	void leftshift()
	{
		a=a<<1;
		System.out.println("After left shift value="+a);
        a=10;
	}
	void rightshift()
	{
		a=a>>1;
		System.out.println("After right value="+a);;
		}

 public static void main(String[] x)
	{
	  
	      binary1 b=new binary1();
		  b.leftshift();
		  b.rightshift();
	}
}
