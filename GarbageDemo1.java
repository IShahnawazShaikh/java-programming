class GarbageDemo1{
	 public static void main(String[] args) {
	 	Runtime obj1=Runtime.getRuntime();
	 	System.out.println("Total Memory of Heap="+obj1.totalMemory());
	 	System.out.println("Available Memory Before Object Creation "+obj1.freeMemory());
	 	for(int i=0;i<100000;i++){
	 		 GarbageDemo1 obj=new GarbageDemo1();
	 		 obj=null;
	 	}
	    System.out.println("Available Memory After Object Creation "+obj1.freeMemory());
	 	System.gc();
	 	System.out.println("Available Memory After gc() "+obj1.freeMemory());

	 	System.out.println(obj1.maxMemory());

	 }
}