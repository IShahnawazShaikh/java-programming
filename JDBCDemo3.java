import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCDemo3 {

	public static void main(String[] args) {
		String query="INSERT into student values(?,?,?,?,?)";
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jdbc","s9716946677s")){
		   PreparedStatement ps=con.prepareStatement(query);
		   ps.setInt(1,105 );
		   ps.setString(2, "naquib");
		   ps.setInt(3,900 );
		   ps.setInt(4,890 );
		   ps.setInt(5,990 );
		   int count=ps.executeUpdate();
		   System.out.println("record inserted");
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
