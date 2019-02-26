import java.util.function.Function;
class student{
	int marks;
	String name;
	public student(int marks,String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
}
public class FunctionalInterfaceDemo2 {

	public static void main(String[] args) {
//	Function<Integer,String> f=i->(i%2==0)?"even":"odd";
//	System.out.println(f.apply(10));  //even
//	
	Function<student,String> f2=s->(s.marks>=80)?"A grade":(s.marks>=60 && s.marks<80)?"B grade":(s.marks>=35 && s.marks<60)? "C grade": "Failed";
	student s[]={
			      new student(85,"shahnawaz"),
			      new student(70,"irfan"),
			      new student(78,"pasha"),
			      new student (89,"Arif"),
			      new student(45,"arif")
	             };
	for(student s1:s)
		System.out.println(s1.name+" result ="+f2.apply(s1));
	}
}

