import java.io.*;
class SerializeDemo implements Serializable{
	int first=100;
	transient  static float rupee=100.77f;
	transient final int second=10;
	transient String name="shahnawaz";
}
class Serialization5{
   public static void main(String[] x)throws FileNotFoundException,IOException,ClassNotFoundException{
       SerializeDemo ref=new SerializeDemo();
	   FileOutputStream fos=new FileOutputStream("File.txt");
	   ObjectOutputStream oos=new ObjectOutputStream(fos);
       oos.writeObject(ref);
	   FileInputStream fis=new FileInputStream("File.txt");
	   ObjectInputStream ois=new ObjectInputStream(fis);
	   SerializeDemo ref2=(SerializeDemo)ois.readObject();
	   System.out.println("First value="+ref2.first+" rupee="+ref2.rupee+"second="+ref2.second+"name="+ref2.name);
	}

}