import java.io.*;
class Demo1 implements Serializable{
	int first=100;
}
class Demo2 implements Serializable{
	int second=200;
}
class Demo3 implements Serializable{
 String name="shahanwaz";
}
class Serialization2{
	public static void main(String[] x)throws FileNotFoundException,IOException,ClassNotFoundException,EOFException{
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
	int index[]=new int[3];
	Object ref=new Object();
     Object ref_demo1=new Object();
   Object ref_demo2=new Object();
    Object ref_demo3=new Object();

	 ref=Ois.readObject();
	for(int i=0;i<3;i++) {
			if(ref instanceof Demo1){
		          index[i]=3;
				  ref_demo1=ref;
 			}
			else if(ref instanceof Demo2){
                      index[i]=1;
					   ref_demo2=ref;
			}
			else if(ref instanceof Demo3){
                 index[i]=2;
				  ref_demo3=ref;
			}
			try{
		   ref=Ois.readObject();
			}
			catch(EOFException EO){}
	    }
		for(int i=0;i<3;i++){
			if(index[i]==1){	   
				 Demo3 deserialization3=(Demo3)ref_demo3;
				 System.out.println(deserialization3.name);
			}
		   if(index[i]==2){	     
			  	 Demo1 deserialization1=(Demo1)ref_demo1;
				 System.out.println(deserialization1.first);
			}
			if(index[i]==3){	                 
				 Demo2 deserialization2=(Demo2)ref_demo2;
				 System.out.println(deserialization2.second);
			}
		}
	}
}
