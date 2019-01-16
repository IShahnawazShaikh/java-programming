class threadLocalDemo2{
	 public static void main(String[] args) {
	 	ThreadLocal l=new ThreadLocal(){
	 		 protected String initialValue(){
              return "JAMIANS";
	 		 } 
	 	};
	 	
	 	System.out.println(l.get());
	 	l.set("shahnawaz");
	 	System.out.println(l.get());
	 	l.remove();
	 	System.out.println(l.get());
	 }
}