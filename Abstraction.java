abstract class abstraction1
{  
	 abstract void area();
}
abstract class abstraction2 extends abstraction1
{
	abstract void perimeter();
}
class abstraction extends abstraction2 
{
      int length=10,breadth=20;
	  void area()
	{ 
		  int area;
		  area=length*breadth;
		  System.out.println("Area of rectangle="+area);
		  perimeter();
	}
	void perimeter()
	{
		int peri;
		peri=2*(this.length+this.breadth);
		System.out.println("Perimeter of rectangle="+peri);
	}
	public static void main(String[] x)
	{
		abstraction abs=new abstraction();
		abs.area();
	}
}
	
