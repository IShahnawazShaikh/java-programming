import java.io.*;

class student{
     int value=10;
	 int display(){
           return value;
	 }
}
class myClass implements Serializable{
    String id="shahnawaz@gmil.com";
    transient String pass="prolog";	
    transient int pin=123;


    private void writeObject(ObjectOutputStream oos)throws IOException,ClassNotFoundException{
    	    oos.defaultWriteObject();
    	    System.out.println("In Write Object");
    	    String pswd="123"+pass;
            int pin2=pin+100;
    	    oos.writeObject(pswd);
    	    oos.writeInt(pin2);
    }
    private void readObject(ObjectInputStream ois)throws IOException,ClassNotFoundException{
    	  ois.defaultReadObject();
    	  //System.out.println("In read object");
    	  String pswd=(String)ois.readObject(); 
    	  int pin2=ois.readInt(); 
    	  pass=pswd.substring(3);
    	  pin=pin2-100;
    }
  
}
class SerializationDemo1{
	 public static void main(String[] args)throws ClassNotFoundException,IOException {
	 	myClass obj1=new myClass();
	 	FileOutputStream fos=new FileOutputStream("prolog.shahnawaz");
	 	ObjectOutputStream oos=new ObjectOutputStream(fos);
	 	oos.writeObject(obj1);
	 	System.out.println(obj1.id+"---"+obj1.pass+"-----"+obj1.pin);

	 	FileInputStream fis=new FileInputStream("prolog.shahnawaz");
	 	ObjectInputStream ois=new ObjectInputStream(fis);
	 	myClass obj2=(myClass)ois.readObject();

	 	System.out.println(obj2.id+"------"+obj2.pass+"-----"+obj2.pin);
	 }
}