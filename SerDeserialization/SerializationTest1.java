import java.io.*;
class SerializationTest1 implements Serializable{
	 final int data1=10;
	 transient int data2=100;
	  private void writeObject(ObjectOutputStream oos)throws Exception{
           data2=data2+1000;
           //System.out.println("In write---"+data1+"--"+data2);
		  oos.writeInt(data2);
	}
	private void readObject(ObjectInputStream ois)throws Exception{
		   int data=ois.readInt();
		    data2=data-1000;
		    System.out.println("in read");

	}
	 public static void main(String[] args)throws Exception {
	 	 SerializationTest1 obj1=new SerializationTest1();
	 	 FileOutputStream fos=new FileOutputStream("File.shahnawaz");
	 	 ObjectOutputStream oos=new ObjectOutputStream(fos);
         oos.writeObject(obj1);
         System.out.println(obj1.data1+"----------------"+obj1.data2);

	 }
	
  }
