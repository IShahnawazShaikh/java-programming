import java.io.*;
class serializeReciever{
	 public static void main(String[] args)throws Exception
	  {
	 	FileInputStream fis=new FileInputStream("file2.ser");
	 	ObjectInputStream ois=new ObjectInputStream(fis);
	    data d=(data)ois.readObject();
	    System.out.println(d.data1+"--------------"+d.data2);
	 }
}