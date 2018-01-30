abstract class  test1
{
	 abstract void show();
}
abstract class test2 extends test1
{
	abstract void calculate();
}
class non_abstract extends test2
{
      int r;
	  double area;
	  non_abstract()

	{
		this.r=20;
	}
	void calculate()
	{
		area=3.14*r*r;
	}
	void show()
	{
		System.out.println("Area of circle="+area);
	}
	public static void main(String[] x)
	{
		non_abstract Y=new non_abstract();
	   Y.calculate();
	   Y.show();
	}
}
