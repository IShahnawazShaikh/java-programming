import java.io.*;
class serialize implements Externalizable
{ 
	 String s="Shahnawaz";
	 int i=10;
	 int j=100;
	 public serialize(){
	 	 System.out.println("serialize no-arg Constructor");
	 	 System.out.println(s);
	 	 System.out.println(i);
	 	 System.out.println(j);
	 	 
	 }
	 public void writeExternal(ObjectOutput out)throws IOException{
        out.writeObject(s);
        out.writeInt(i);
	 }
	 public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException{
        s=(String)in.readObject();
         i=in.readInt();
         System.out.println("ok");
         //System.out.print(in.readInt());
	 }
	 

}
class SerializationExDemo2{
  public static void main(String[] args)throws Exception
    {
  	serialize obj1=new serialize();
  	FileOutputStream fos=new FileOutputStream("file1.ser");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(obj1);

    FileInputStream fis=new FileInputStream("file1.ser");
    ObjectInputStream ois=new ObjectInputStream(fis);
     serialize obj2=(serialize)ois.readObject();
     System.out.println(obj2.s+"---------"+obj2.i+"----------"+obj2.j);


  }
}