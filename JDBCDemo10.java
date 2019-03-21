import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class JDBCDemo3 {
	public static void main (String[] args) throws SQLException, InterruptedException {
		String name[]={ "shahnawaz","shahbaz","Irfa"};
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jdbc","s9716946677s");
		 Statement stmt1=con.createStatement();
		 Statement stmt2=con.createStatement();
		 ResultSet rs=stmt2.executeQuery("select * from STUDENT");
		 new Thread(()->{
		  try{
		  	Thread.sleep(1000);	
         	while(rs.next()){
		    System.out.println(Thread.currentThread().getName()+" fetch :");
         		 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
         	}
         }
       catch(Exception ex){}  
     }).start();
       for(int i=0;i<2;i++){  
		    System.out.println(Thread.currentThread().getName()+" inserted a record");
         	int count=stmt1.executeUpdate("INSERT into STUDENT values (101,'pasha','20')");
         }
		}
	}