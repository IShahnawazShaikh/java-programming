import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
class Demo1 implements Serializable{
	int first=100;
}
class Demo2 implements Serializable{
	int second=200;
}
class Demo3 implements Serializable{
	String name="shahnawaz";
}
class Serialization1{
	public static void main(String[] x)throws FileNotFoundException,IOException,ClassNotFoundException
	{
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
		FileOutputStream fos=new FileOutputStream("shahnawaz.ser");
        ObjectOutputStream objs=new ObjectOutputStream(fos);
		objs.writeObject(d1);
		objs.writeObject(d2);
		objs.writeObject(d3);
		FileInputStream Fis=new FileInputStream("shahnawaz.ser");
		ObjectInputStream Ois=new ObjectInputStream(Fis);
         Demo1 de_serial1=(Demo1)Ois.readObject();
		 Demo2 de_serial2=(Demo2)Ois.readObject();
		 Demo3 de_serial3=(Demo3)Ois.readObject();
		 System.out.println("Demo1 object's value="+de_serial1.first);
		 System.out.println("Demo2 object's value="+de_serial2.second);
		 System.out.println("Demo3 object's value="+de_serial3.name);
	}
}
