/*----------------------------------Showing InvalidClassException----------------------*/
import java.io.*;
class parent{
    int data1=10;
    parent(int i){
        System.out.println("In parent one argument constructor");
    }
}
class child extends parent implements Serializable{
    int data2=30;
    child(){
      super(10);
       System.out.println("In child constructor");
    }
}
class SerializeDemo10{
	 public static void main(String[] args)throws Exception
	  {  
	  	
	 	  child ch=new child();
      ch.data1=888;
      ch.data2=999;
      System.out.println("child"+ch.data1);
           System.out.println("parent"+ch.data2);
	 	  FileOutputStream fos=new FileOutputStream("shahnawaz3.ser");
	 	  ObjectOutputStream oos=new ObjectOutputStream(fos);
	 	  oos.writeObject(ch);
	 	  
	 	   FileInputStream fis=new FileInputStream("shahnawaz3.ser"); 
     	   ObjectInputStream ois=new ObjectInputStream(fis);
           child ch1=(child)ois.readObject();
           System.out.println("child"+ch1.data1);
           System.out.println("parent"+ch1.data2);
          

     	  }
     	}