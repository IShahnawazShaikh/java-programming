class F
{
	int x=1;
}


class FATHER extends F
{
       int x=2;
}


class grand_father extends FATHER 
{
	   int x=5;
}

class parent extends grand_father
{
	int x=10;

}

class child4 extends parent
{
	  int x=20;  
	  void show()
	{
		   System.out.println("value of x in child class="+x);
		   System.out.println("value of x in parent class="+super.x);
		   System.out.println("value of x in grand parent class="+((grand_father)this).x);
		    System.out.println("value of x in grand parent class="+((FATHER)this).x);
			 System.out.println("value of x in grand parent class="+((F)this).x);

	}
      public static void main(String[] x)
       {
	       child4 c=new child4();
		   c.show();
      }
}
