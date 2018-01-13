class parent
{
	int x=10;
}

class child2 extends parent
{
	  int x=20;  
	  void show()
	{
		  System.out.println(x);
		   System.out.println(super.x);
	}
      public static void main(String[] x)
       {
	       child2 c=new child2();
		   c.show();
      }
}
