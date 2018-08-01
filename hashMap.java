import java.util.*;
class hashMap{
	void work(){
     HashMap mp=new HashMap();
	int i,x=100;
    for(i=0;i<5;i++){
	mp.put(i,x);
	x=x+10;
   }
	System.out.println(mp);
	HashMap mp2=new HashMap();
   mp2.put("shahnawaz",0);
	mp2.put("arif",1);
    mp2.put("Irfan",2);
    mp2.put("Umar",4);
	mp2.put("Pasha",5);
	 mp2.put("sami",6);
    mp2.put("Talha",7);
	  mp.putAll(mp2);
	 System.out.println("Keys and valus of first Map="+mp);
	  System.out.println("key and values of Second map:"+mp2);
	  Set s=mp2.keySet();
	 Collection c=mp2.values();
	 System.out.println("All the keys of Map are:"+s);
	System.out.println("All the values of Map are:"+c);
	Set s1=mp2.entrySet();
	Iterator itr=s1.iterator();
	while(itr.hasNext()){
	Map.Entry m=(Map.Entry)itr.next();
	Integer values=(Integer)m.getValue();
	if(values%2==0)
	System.out.println("Key:----->"+m.getKey()+"  Values="+m.getValue());
	}
 }
public static void main(String...p){
		   hashMap h=new hashMap();
		   h.work();
	 }
}