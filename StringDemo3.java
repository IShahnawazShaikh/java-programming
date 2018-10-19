class StringDemo3
{
	  String name;
	 StringDemo3(String string){
       this.name=string;

	 }
	 public static void main(String...x){
		 StringDemo3 s1=new StringDemo3("shahnawaz");
        StringDemo3 s2=new StringDemo3("shahnawaz");
		String str1=new String("hello");
		String str2=new String("hello");
		StringDemo3 s3=s2;
        System.out.println(s1);
		System.out.println(s2);
		System.out.println(str1);
		System.out.println(str2);
	    System.out.println(s1==s2);
	    System.out.println(s1.equals(s2));          //Reference Comparision return false
	    System.out.println(s3.equals(s2));           //Reference Comparision return true
	    System.out.println(str1.equals(str2));        //Content Comparision return true
	    System.out.println((s1.name).equals((s2.name)));     //Content Comparision return true
       System.out.println(s3==s2);     //true


  }
}