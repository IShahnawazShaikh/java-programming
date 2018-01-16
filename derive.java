class base
{
	int a=10,b=20;
	void method()
	{
		 System.out.println("I am in base class");
	}
}
class derive extends base
{
	  int a=20,c=30;
	void method()
	{
		System.out.println("I am in derive class");
	}
	public static void main(String[] x)
	{
		derive d=new derive();
		System.out.println(d.a);
			System.out.println(d.b);
				System.out.println(d.c);
		d.method();
	}
}