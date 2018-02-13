class hash
{
	int i;
	hash(int i)
	 {
		  this.i=i;
	 }
	  public int hashCode()
	    {
		      return i;
		}
		public static void main(String[] x)
	    {
			  hash h1=new hash(100);
			  hash h2=new hash(15);
			  System.out.println(h1);
			   System.out.println(h2);
		}
}