import java.io.*;
class serialize implements Externalizable
{ 
	 String s;
	 int i;
	 int j;
	 public serialize(){
	 	 System.out.println("serialize no-arg Constructor");
	 }
	 serialize(String s,int i,int j){
	 	  this.s=s;
	 	  this.i=i;
	 	  this.j=j;
	 }
	 public void writeExternal(ObjectOutput out)throws IOException{
        out.writeObject(s);
        out.writeInt(i);
	 }
	 public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException{
        s=(String)in.readObject();
         i=in.readInt();
	 }
	 

}
class SerializationExDemo1{
  public static void main(String[] args)throws Exception
    {
  	serialize obj1=new serialize("Shahnawaz",10,1000);
  	FileOutputStream fos=new FileOutputStream("file1.ser");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(obj1);

    FileInputStream fis=new FileInputStream("file1.ser");
    ObjectInputStream ois=new ObjectInputStream(fis);
     serialize obj2=(serialize)ois.readObject();
     System.out.println(obj2.s+"---------"+obj2.i+"----------"+obj2.j);


  }
}