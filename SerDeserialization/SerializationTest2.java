import java.io.*;
class SerializationTest2 implements Serializable{

	 public static void main(String[] args)throws Exception {
	 	 FileInputStream fis=new FileInputStream("File.shahnawaz");
	 	 ObjectInputStream ois=new ObjectInputStream(fis);
        SerializationTest1 obj2=(SerializationTest1)ois.readObject();
       
         System.out.println(obj2.data1+"----------------"+obj2.data2);

	 }
}