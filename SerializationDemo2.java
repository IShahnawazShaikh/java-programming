import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
class A implements Serializable{
String value="We";
     B b=new B();
}
class B implements Serializable{
	 String value="are";
	 void bMethod(){
        System.out.println("In B class");
	 }
     C c=new C();
}
class C implements Serializable{
    String value="Prologian";
    void cMethod(){
        System.out.println("In C class");
	 }

}
class SerializationDemo2{
	public static void main(String[] c)throws FileNotFoundException,IOException,ClassNotFoundException{
		 A a=new A();
		 FileOutputStream fos=new FileOutputStream("Shahnawaz.ser");
		 ObjectOutputStream oos=new ObjectOutputStream(fos);
		 oos.writeObject(a);
		 FileInputStream fis=new FileInputStream("shahnawaz.ser");
		 ObjectInputStream ois=new ObjectInputStream(fis);
		 A obj=(A)ois.readObject();
		 System.out.println(obj.value);
		 System.out.println(obj.b.value);
		 System.out.println(obj.b.c.value);
		 obj.b.bMethod();
		 obj.b.c.cMethod();
	}
}
