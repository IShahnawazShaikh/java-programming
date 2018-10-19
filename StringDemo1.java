//overridetoString Method
class StringDemo1
{
	   String name;
	   int roll;
	  StringDemo1(String name,int roll){
        this.name=name;
		this.roll=roll;
	  }

	  public String toString(){
           // return getClass().getName()+'@'+Integer.toHexString(hashCode());       //by default generate refrenceName   
		   //return "Reference name Changed to Shahnawaz";
		   return name;
	  }
	   
	 public static void main(String...x){
         StringDemo1 s1=new StringDemo1("shahnawaz",60);
		 StringDemo1 s2=new StringDemo1("Pasha",61);
		 StringDemo1 s3=new StringDemo1("Luppo",62);
		 System.out.println(s1);       //or   s1.toString();
		  System.out.println(s2);
		   System.out.println(s3);

	 }
}