import java.io.*;
class serializeSender{
	  public static void main(String[] args)throws Exception
	   {
	  	  data d1=new data();
	  	  FileOutputStream fos=new FileOutputStream("file2.ser");
	  	  ObjectOutputStream oos=new ObjectOutputStream(fos);
	  	  oos.writeObject(d1);
	  }  
}