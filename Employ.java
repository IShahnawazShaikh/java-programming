class address
{
      String city,state,country;
      address(String p,String q,String r)
        { 
                this.city=p;
		       this.state=q;
		        this.country=r;
         }
   }
class Employ
{
     String name;
     int id;
     Employ(String n,int i)
     {
           this.name=n;
	       this.id=i;
     }
     void display(address a)
     {
          System.out.println("Name="+name);
	     System.out.println("Id="+id);
	     System.out.println("City="+a.city);
	     System.out.println("State="+a.state);
         System.out.println("country="+a.country);
	   }
     public static void main(String[] ar)
         {
             
			   Employ e=new Employ("Shahnawaz",20161); 
	           address a=new address("South delhi","Delhi","INDIA");
			   e.display(a);
         }
	   
   }