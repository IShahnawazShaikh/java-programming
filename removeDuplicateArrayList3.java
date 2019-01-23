import java.util.ArrayList;
class removeDuplicateArrayList3{
	 public static void main(String[] args) {
	 	ArrayList <student>al=new ArrayList<student>();
	 	ArrayList <student>al2=new ArrayList<student>();
	   
	    student s1=new student();    
	    student s2=new student();    
	    student s3=new student();    
        al.add(s1);
        al.add(s2);
        al.add(s2);
        al.add(s3);
        
        System.out.println("ArrayList with Duplicate Value "+al);
	    for(student O: al){
	    	  if(!al2.contains(O)){
                 al2.add(O);
	    	  	 
	    	  }
	    }
        System.out.println("Removed Duplicate Value "+al2);
        al=null;
	 }
}
class student{
	
	 student(){  
	 }
	
}
