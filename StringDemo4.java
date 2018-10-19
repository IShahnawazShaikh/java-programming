class StringDemo4 { 
	public static void main(String[] args) 
	{ 
		Thread t = new Thread(); 
		//Object o = new Object(); 
		String s = new String("shahnawaz"); 
		String s2 = new String("shahnawaz"); 

		//System.out.println(t == s);   incompatible compile time error. 
		System.out.println(s == s);   //true
		System.out.println(s == t);    //false
	    System.out.println(t.equals(s));    //incompatibl but equals() always rturn false. 
	} 
}