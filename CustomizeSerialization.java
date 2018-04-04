import java.io.*;
class Data implements Serializable
{
	String Email="shahnawaz@gmail.com";
	transient String Password="shahnawaz";
	transient int pin=25;
	private void writeObject(ObjectOutputStream oos)throws Exception
	{
		oos.defaultWriteObject();
		String pswd="1234"+Password;
		int pin_no=pin+25;
		oos.writeObject(pswd);
		oos.writeObject(pin_no);
	}
	private void readObject(ObjectInputStream ois)throws Exception
	{
		ois.defaultReadObject();
		String pswd=(String)ois.readObject();
		int value=(int)ois.readObject();
		Password=pswd.substring(4);
		pin=value-25;
	}	
}
class CustomizeSerialization
{
       public static void main(String[] x)throws FileNotFoundException,IOException,ClassNotFoundException{
		   Data d=new Data();
		   FileOutputStream fos=new FileOutputStream("File2.txt");
		   ObjectOutputStream oos=new ObjectOutputStream(fos);
		   oos.writeObject(d);
		   FileInputStream fis=new FileInputStream("File2.txt");
		   ObjectInputStream ois=new ObjectInputStream(fis);
		   Data d1=(Data)ois.readObject();
		   System.out.println("Email="+d1.Email+" Password="+d1.Password+" pin="+d1.pin);
	   }
}