import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.OracleTypes;

public class JDBCDemo7 {
  public static void main(String...x) throws SQLException{
	  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jdbc","s9716946677s");
	  String query="{?=call MY_FUNCTION(?,?)}";
	  CallableStatement cs=con.prepareCall(query);
	  cs.setInt(2, 101);
	  cs.registerOutParameter(1,OracleTypes.CURSOR);
	  cs.registerOutParameter(3,Types.INTEGER);
	  cs.execute();
	  System.out.println(cs.getInt(3));
	  ResultSet rs=(ResultSet) cs.getObject(1);
	  while(rs.next())
	  {
		  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));  
	  }
	  
  }
}
