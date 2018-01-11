class  chaining
{ 
	  chaining()
	{     
		  this(60);
          System.out.println("Understood constructor chaining");
	}
	chaining(int roll)
	{
		this("Shahnawaz shaikh");
		System.out.println("Roll number of the student="+roll);
	}
	chaining(String name)
	{
		System.out.println("Name of the student="+name);
	}
	public static void main(String[] args)
	{
		new chaining();
	}
}
