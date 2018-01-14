class operation
{
           double square(double s)
	{
			   return s*s;
	}
}
class circle
{
	   double calculate(double d)
	{
		   operation op=new operation();
		   return (3.14*op.square(d));
	}
	public static void main(String[] ar)
	{
		   circle c=new circle();
		  double result=c.calculate(3.3);
		 System.out.println("Area of circle="+result);
	}
}