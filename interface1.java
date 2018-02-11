interface A
{
	void show();
}
interface B extends A
{
	void display();
}
class interface1 implements A,B
{
	public void show()
	{
		System.out.println("understanding interface");
	}
	public void display()
	{
		System.out.println("Interface cannot be initiated");
		System.out.println("It is a mechanism to show multiple inheritance");
	}
	public static void main(String[]x)
	{
		interface1 inter=new interface1();
		inter.display();
		inter.show();
	}
}