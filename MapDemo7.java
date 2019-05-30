import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
class Student{
	String name;
	int roll;
	Student(String name,int roll){
		 this.name=name;
		 this.roll=roll;
	}
	public String toString() {
		 return name+"->"+roll;
	}
}
public class MapDemo7 {
	public static void main(String[] args) {
		SortedMap Smap=new TreeMap((obj1,obj2)->{
		    return (((Student)obj1).roll>((Student)obj2).roll) ? -1:(((Student)obj1).roll<((Student)obj2).roll) ? 1:0;
		  });
		Smap.put(new Student("Shahnawaz",106),700);
		Smap.put(new Student("Shaikh",103),700);
		Smap.put(new Student("Shah",100),700);
		System.out.println(Smap);
		System.out.println(Smap.comparator());
	}
}


