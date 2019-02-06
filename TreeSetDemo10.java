import java.util.TreeSet;
import java.util.Comparator;
class Employee implements Comparator{
	String name;
	int id;
	Employee(String name,int id){
       this.name=name;
       this.id=id;
	}
	public int compare(Object obj1,Object obj2){
        Employee e1=(Employee)obj1;
        Employee e2=(Employee)obj2;
        int id1=e1.id;
        int id2=e2.id;
        if(id2>id1)
        	return +1;
         if(id2<id1)
        	return -1;
        else
        	return 0;
	}
	public String toString(){
		 return name+"---"+id;
	}
}
class TreeSetDemo10{
	 public static void main(String[] args) {
	 	TreeSet t=new TreeSet(new Employee("p",1000));
	 	Employee e1=new Employee("shah",101);
	 	Employee e2=new Employee("Iffo",109);
	 	Employee e3=new Employee("Arif",103);

	 	t.add(e1);
	 	t.add(e2);   
	 	t.add(e3);   
	 	t.add(new Employee("pasha",104));
	 	System.out.println(t);
	 }
}