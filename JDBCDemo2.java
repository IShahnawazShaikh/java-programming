import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemo2 {
	Connection con=null;
	Statement s1=null,s2=null,s3=null,s4=null;
	JDBCDemo2(){
		try{
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jdbc","s9716946677s");
			s1=con.createStatement();
			s2=con.createStatement();
			s3=con.createStatement();
			s4=con.createStatement();
		}
		catch(Exception ex){ex.printStackTrace();}
	}
	void insertRecords(int id,String name,int m1,int m2) throws SQLException{
			s1.executeUpdate("INSERT into student values("+id+",'"+name+"',"+m1+","+m2+") ");
			System.out.println("record inserted");
	}
	void updateRecord() throws SQLException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Id for Update");
		  int id=sc.nextInt();
			int count=s2.executeUpdate("UPDATE student set name='Pasha' where S_ID="+id+"");
			System.out.println(count+" record updated");
	}
	void deleteRecord(int id) throws SQLException{
			int count=s3.executeUpdate("DELETE from student where s_id="+id+"");
			System.out.println(count+" record deleted");
	}
void fetchRecord() throws SQLException{
	 ResultSet rs=s4.executeQuery("SELECT * from student");
	 while(rs.next()){
		  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
	 }
}
	public static void main(String[] args) throws SQLException{
		JDBCDemo2 obj=new JDBCDemo2();
		obj.insertRecords(101,"Irfan",890,800);
		obj.insertRecords(102,"shahnawaz",890,800);
		obj.updateRecord();
		obj.deleteRecord(101);
		obj.insertRecords(101,"Irfan",890,800);
		obj.fetchRecord(); 		
	}

}
