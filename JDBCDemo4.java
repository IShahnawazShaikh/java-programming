import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo4 {
  public static void main(String...x){
	  String query1="SELECT * from Student where s_id=?";  //with place holder
	  //String query2="SELECT * from Student";    // without place holder
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jdbc","s9716946677s")){
		   
			PreparedStatement ps=con.prepareStatement(query1);
			//PreparedStatement ps=con.prepareStatement(query2);
		   ps.setInt(1, 101);
			ResultSet rs=ps.executeQuery();
		   while(rs.next()){
			    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+ rs.getInt(4));
		   }
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
  }
}
