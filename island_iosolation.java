class  island_iosolation
{
	static  island_iosolation i;
	public static void main(String[] args) 
	{
        island_iosolation t1=new island_iosolation();
		island_iosolation t2=new island_iosolation();
		island_iosolation t3=new island_iosolation();
        t1.i=t2;
		t2.i=t3;
		t3.i=t1;
	  System.out.println("Rference before eligible for garbage collection");
	  System.out.println(t1);
	  System.out.println(t2);
     System.out.println(t3);
	 t1=null;
	 t2=null;
	 t3=null;
	}
}
