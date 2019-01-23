import java.util.ArrayList;
class reverseArrayList{
	 public static void main(String[] args) {
	 	int j=0,counter=0;
	 	ArrayList al=new ArrayList();
	 	al.add(1);
	    al.add(2);
	    al.add(3);
	    al.add("shahnawaz");
	    al.add(3.8);
	    al.add('A');
	    al.add(null);
	    al.add("n1");
	    al.add("n2");
	    al.add("n4");
	    al.add("n5");
	    al.add("n6");
	    al.add("n7");
	    System.out.println(al);
         if(al.size()%2==0)
         	 counter=(al.size()/2)-1;
         else
         	 counter=al.size()/2;
	    for(int i=(al.size()-1);i>counter;i--){
	    	  Object obj=al.set(j,al.get((al.size()-(j+1))));
	    	  al.set(i,obj);
	    	  j++;
	    }
	    System.out.println(al);
	}
}

