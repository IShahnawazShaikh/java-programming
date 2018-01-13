class parent
{
	int x,y;
}
class child extends parent
{
	void set(int p,int q)
	{
		this.x=p;
		this.y=q;
	  }
	  	void show()
	{
        System.out.println("Area of Rectangle ="+x*y);
	}

public static void main(String[] x)
       {
	       child c=new child();
		   c.set(20,30);
		   c.show();
      }
}
