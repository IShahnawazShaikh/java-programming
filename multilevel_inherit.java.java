class A
{
	A()
	{
		System.out.println("A");
	}
}
class B extends A
{
	B()
	{
	    
		System.out.println("B");
	}
	B(int x)
	{
		System.out.println("one arg B-"+x);
	}
}
class C extends B
{
	C()
	{
		super(10);
		System.out.println("C");
	}
	C(int x)
	{
		System.out.println("one arg C-"+x);
	}
	public static void main(String [] x)
	{
		new C();
		new C(2);
	}
}