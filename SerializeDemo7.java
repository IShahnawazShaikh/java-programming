import java.io.*;
class Gparent{
    int data1=10;
}
class parent extends Gparent implements Serializable{
    int data2=20;
}
class child extends parent{
    int data3=30;
}
class SerializeDemo7{
	 public static void main(String[] args)throws Exception
	  {  
	  	
	 	   child ch=new child();
	 	  FileOutputStream fos=new FileOutputStream("shahnawaz3.ser");
	 	  ObjectOutputStream oos=new ObjectOutputStream(fos);
	 	  oos.writeObject(ch);
	 	  
	 	   FileInputStream fis=new FileInputStream("shahnawaz3.ser"); 
     	   ObjectInputStream ois=new ObjectInputStream(fis);
           child ch1=(child)ois.readObject();
           System.out.println("child"+ch1.data3);
           System.out.println("parent"+ch1.data2);
           System.out.println("Gparent"+ch1.data1);

     	  }
     	}