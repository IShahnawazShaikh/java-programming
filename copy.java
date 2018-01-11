class copy
{

   int x,y;
   copy(int x,int y)
	{
	     this.x=x;
		 this.y=y;
	}
	copy(copy ref)
	{
		  this.x=ref.x;
		  this.y=ref.y;
	}
	void show()
	{
		 System.out.println(x);
		 System.out.println(y);
	}
	public static void main(String[] x)
	{
		copy c1=new copy(20,30);
        c1.show();
		copy c2=new copy(c1);
        c2.show();
   }
}