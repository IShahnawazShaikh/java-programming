class equals 
{
	int roll;
	String name;
     equals(String name,int roll)
	  {
		    this.name=name;
			this.roll=roll;
	  }
	  public static void main(String [] x)
	    {
		      equals e1=new equals("shahnawaz",12 );
              equals e2=new equals("irfan",13);
               equals e3=new equals("irfan",13);
			   System.out.println(e1);
			   System.out.println(e2);
			   System.out.println(e3);
			   System.out.println(e1==e2);
			   System.out.println(e2.equals(e3));
		}
	
}