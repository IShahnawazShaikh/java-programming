class A
{
     void show(int i,char c)
     {
          System.out.println("first show");
     } 
   void show(char c,int i)
   {
      System.out.println("Second show");
    }
 }
 class B extends A
 {
       public static void main(String[] x)
       {
             A a=new A();
    	     a.show(2,'c');
	        a.show('s',4);
	   }
}

