class  Runtime_class
{
	public static void main(String[] args) 
	{
       Runtime_class R1=new Runtime_class();
	   Runtime_class R2=new Runtime_class();
	   Runtime_class R3=new Runtime_class();
	   R1=null;
	   R2=null;
	   R3=null;
	 Runtime r=Runtime.getRuntime();
	 System.out.println(r.freeMemory());
	 System.out.println(r.totalMemory());
	 r.gc();
	}
}
