class GarbageDemo2{

	 	 public void finalize(){
	 	 	   System.out.println("finalize");
	 	 }
	 public static void main(String[] args) {
	 	 String s=new String("shahnawaz");
	 	 GarbageDemo2 t=new GarbageDemo2();
	 	 t.finalize();
	 	 s=null;
	 	 t=null;
	 	 System.gc();
	 	 System.out.println("End of Main");
	 }
}