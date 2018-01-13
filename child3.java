class parent
{
	int x=10;
	parent()
	{
		System.out.println("parent constructor");
	}
	  void show()
	{
		  System.out.println("perent class show");
	}
}

class child3 extends parent
{
	
	  child3()
	{
             super();
		     System.out.println("child constructor");
	}

	  int x=20;  
	  void show()
	{
		   super.show();
		   System.out.println("child class show");
		   System.out.println("value of x in child class="+x);
		   System.out.println("value of x in parent class="+super.x);
	}
      public static void main(String[] x)
       {
	       child3 c=new child3();
		   c.show();
      }
}
