import java.io.*;
class Parent 
{
	int value1=10;
	Parent(){
	}
}
class Child extends Parent implements Serializable
{
	int value2=100;

}
class Serialization7
{
	public static void main(String[] x)throws FileNotFoundException,IOException,ClassNotFoundException
	{
		Child ch=new Child();
		ch.value1=888;
		ch.value2=999;
		FileOutputStream fos=new FileOutputStream("File.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ch);
		FileInputStream fis=new FileInputStream("File.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Child ch2=(Child)ois.readObject();
		System.out.println(ch2.value1+"     "+ch2.value2);
   }
}