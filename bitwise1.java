class bitwise1
{
	int a=10;
	
	public static void main(String[] x)
	{
	    bitwise1 m=new bitwise1();
		m.show();
	}
	void show()
	{
		a=((a<<3)-a)>>1;
		System.out.println("Answer is="+a);      //multiply 3.5 without using multiply operator 
		a=10;
		a=((a<<2)-a);
		System.out.println("Answer is="+a);           //multiply by 3 without using multiply operator
	}
    
}