class genericClass<T>
{      
	   T t;
		void show(T t){
                 this.t=t;
				 System.out.println(t.getClass().getName());
		}
		T getValue(){
		   return t;
		}

	   public static void main(String...x){
            genericClass<Integer>gc=new <Integer>genericClass();
			genericClass<String>gc1=new <String>genericClass();
			genericClass<Float>gc2=new <Float>genericClass();
			gc.show(10);
			System.out.println(gc.getValue());
			gc1.show("Shahnawaz");
	       System.out.println(gc1.getValue());
		  gc2.show(10.5f);
	      System.out.println(gc2.getValue());
	  
	  }
}