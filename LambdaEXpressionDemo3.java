import java.util.LinkedList;
@FunctionalInterface
interface addList{
	void addMyList(int al);
}
@FunctionalInterface
interface retrieveList{
	 Object myList(int i);
}
public class LambdaEXpressionDemo3 {

	public static void main(String[] args) {
		addList lambda1;
		retrieveList lambda2;
		LinkedList l1=new LinkedList();
		lambda1=(obj)-> l1.add(obj);
		lambda2=(i)->l1.get(i);
		
		
		for(int i=1;i<=10;i++){
			lambda1.addMyList(i+10);  
		}  
		
		
		System.out.println("Objects in LinkedList: "+l1);
		for(int i=0;i<10;i++){
			System.out.println(lambda2.myList(i));  
		}
		 
	}
}
