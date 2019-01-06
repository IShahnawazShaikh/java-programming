class	GarbageDemo3 {
 static	GarbageDemo3 s;
  public void finalize() { 
     //System.out.println(10/0);
	 System.out.println("Finalize method called");
	 s=this;
	}
 public	static void main(String[] args)throws	InterruptedException {
     GarbageDemo3 t=new GarbageDemo3();
     System.out.println(t.hashCode());
     //t.finalize();
     t=null; 
     System.gc(); 
     Thread.sleep(500);
     System.out.println(s.hashCode());
     s=null;
     System.gc();
     Thread.sleep(500); 
     System.out.println("End of Main");
  }
}
