import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class JDBCDemo6 {

	public static void main(String[] args) throws SQLException {
		String query="{call first_pro(?,?)}";
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jdbc","s9716946677s"))
        {
		  CallableStatement cs=con.prepareCall(query);
		  cs.setInt(1, 10);
		  cs.registerOutParameter(2,Types.INTEGER);   //registering out parameter with JDBC datatype
		  cs.execute();
		  int result=cs.getInt(2);
		  System.out.println(result);
		}

	}

}
