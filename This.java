//program to this is refernce variable
class This  
{
	   
	   void show()
	{
		      System.out.println(this);
	}
	public static void main(String[] x) 
	{
		  This a=new This();
		  System.out.println(a);
		  a.show();
	}
}
