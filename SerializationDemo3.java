import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
class parent implements Serializable{
    int parentData=10;
    
}
class child extends parent{
    int childData=20;
    int parentData=100;
    void display(){
    	System.out.println("Jamian");
    }
    int parentDatadisplay(){
    	 return super.parentData;
    }
 }
class SerializationDemo3{
	public static void main(String[] c)throws FileNotFoundException,IOException,ClassNotFoundException{
		 child obj1=new child();
		 FileOutputStream fos=new FileOutputStream("File3.ser");
		 ObjectOutputStream oos=new ObjectOutputStream(fos);
		 obj1.display();
		 System.out.println("Child data="+obj1.childData);
		 System.out.println("parent data="+obj1.parentData);
		 System.out.println("parent data="+obj1.parentData);
		 oos.writeObject(obj1);
        
		 FileInputStream fis=new FileInputStream("File3.ser");
		 ObjectInputStream ois=new ObjectInputStream(fis);
		 child obj2=(child)ois.readObject();
		 obj2.display();
		 System.out.println("Child data="+obj2.childData);
		 System.out.println("Child parent data="+obj2.parentData);
		 System.out.println("parent data="+obj2.parentDatadisplay());
	}
}
