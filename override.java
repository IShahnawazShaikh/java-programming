class base
{
	base method()
	{
		 System.out.println("I am in base class");
           return this;
	}
}
class override extends base
{
	override method()
	{
		System.out.println("I am in derive class");
		return this;
	}
	public static void main(String[] x)
	{
		override d=new override();
	    d.method();
	}
}