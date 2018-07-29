import	java.util.*; 
public	class	TreeSetDemo1{
	public	static	void	main(String[]	args){
		TreeSet t	=	new	TreeSet();
		t.add(new	StringBuffer("A"));                    
		/*t.add(new	StringBuffer("Z"));            //Produce Class ast exception  because StringBuffer cannot implements java.lang.comparable interface
		t.add(new	StringBuffer("L"));
		t.add(new	StringBuffer("B"));*/
		System.out.println(t);
		}
}