import java.util.TreeSet;
class Employee implements Comparable{
	String name;
	int id;
	Employee(String name,int id){
    
       this.name=name;
       this.id=id;
	}
	public int compareTo(Object obj){
        int id2=this.id;
        Employee e=(Employee)obj;
        int id1=e.id;
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
class TreeSetDemo9{
	 public static void main(String[] args) {
	 	TreeSet t=new TreeSet();
	 	Employee e1=new Employee("shah",101);
	 	Employee e2=new Employee("Iffo",109);
	 	Employee e3=new Employee("Arif",103);

	 	t.add(e1);
	 	t.add(e2);   //e2.comapreTo(e1);
	 	t.add(e3);   //e3.comapreTo(e2);

	 	t.add(new Employee("pasha",104));
	 	System.out.println(t);
	 }
}