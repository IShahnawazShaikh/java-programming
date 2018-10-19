class StringClonning
{
	 int i=10;
	 public static void main(String...c){
		 StringCloing s=new StringClonning();
        s2=(StringClonning)s.clone();
		System.out.println(s2.i);
		s.i=25;
		System.out.println(s2.i);
 }
}