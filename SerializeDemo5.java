import java.io.*;
class myClass1 implements Serializable{
    int data1=10;
}
class myClass2 implements Serializable{
    int data2=20;
}
class myClass3 implements Serializable{
    int data3=30;
}
class SerializeDemo5{
	 public static void main(String[] args)throws Exception
	  {  
	  	 int counter=0;
	  	 boolean set=true;
	 	  myClass1 obj1=new myClass1();
	 	  myClass2 obj2=new myClass2();
	 	  myClass3 obj3=new myClass3();
	 	  FileOutputStream fos=new FileOutputStream("shahnawaz2.ser");
	 	  ObjectOutputStream oos=new ObjectOutputStream(fos);
	 	  oos.writeObject(obj1);
	 	  oos.writeObject(obj2);
	 	  oos.writeObject(obj3);

	 	  FileInputStream fis=new FileInputStream("shahnawaz2.ser"); 
     	   ObjectInputStream ois=new ObjectInputStream(fis);
     	   while(set){
     	   	  Object O=ois.readObject();
     	   	   if(O instanceof myClass2){
                 myClass2 obj5=(myClass2)O;
                 counter++;
                 System.out.println("Second"+obj5.data2);
     	   	   }
     	   	  if(O instanceof myClass1){
                 myClass1 obj4=(myClass1)O;
                 counter++;
                 System.out.println("First"+obj4.data1);
     	   	    }
     	   	   if(O instanceof myClass3){
                 myClass3 obj6=(myClass3)O;
                 counter++;
                 System.out.println("Three"+obj6.data3);
                 
     	   	  }
     	   	  if(counter==3)
     	   	  	 set=false;
     	   }

	 }
}