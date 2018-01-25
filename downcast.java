class base
{
	 void dis()
	{
		System.out.println("base");
	}
}
class derive extends base
{
	void dis()
	{
		
		System.out.println("derive");
	}
	public static void main(String[] x)
	{
		base a=new derive();
                derive d=(derive)a;
		  a.dis();
	}
}