interface B{
	void show();
}
interface C{
	int show2(String s);
}
interface A{
	public static void main(String[] args) {
		B b=()->{
			C c=s->s.length();
			for(String s1:args)
				 System.out.println("Length of "+s1+" "+c.show2(s1));
		};
		b.show();
	}
}