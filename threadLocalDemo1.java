class threadLocalDemo1{
	 public static void main(String[] args) {
	 	ThreadLocal l=new ThreadLocal();
	 	
	 	System.out.println(l.get());
	 	l.set("shahnawaz");
	 	System.out.println(l.get());
	 	l.set("shahnawaz2");
	 	System.out.println(l.get());
	 	l.remove();
	 	System.out.println(l.get());
	 }
}