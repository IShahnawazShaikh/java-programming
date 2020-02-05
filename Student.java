import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Student {
String name,Id,number;
public void add(Scanner sc) {
	System.out.println("Enter Name Of Student");
     this.name=sc.next();
 	System.out.println("Enter ID Of Student");
     this.Id=sc.next();
     System.out.println("Enter Number Of Student");
     this.number=sc.next();
}
public static void main(String...x){
         int n;
         ArrayList<Student> list=new ArrayList<Student>();
         Boolean status=true;
         Scanner sc=new Scanner(System.in);
         while(status){
	    	 System.out.println("1. Add Student\n 2. Show Details \n 3.exit");
            try{
            	n=sc.nextInt();
            	 switch(n){
                case 1:
            	 System.out.println("Add");
                  Student s=new Student();
                  s.add(sc);
                  list.add(s);
            	 break;
                case 2:
            	 if(list.size()==0){
            		 System.out.println("First Add The Student");
            	 }
            	 else{
                	Iterator itr=list.iterator();
            	    while(itr.hasNext())
            		 ((Student)itr.next()).show();
            	 }
            	 break;
                 case 3:
            	 status=false;
            	 System.out.println("Program terminated:");
            	 break;
            	 default:
            		 System.out.println("Not valid number");
               }
             }
             catch(Exception ae){
            	    System.out.println("String Not Allowed");
             }
	       }
    }
private void show() {
	 System.out.println(this.name+" "+this.Id+" "+this.number+"\n");
 }
}
