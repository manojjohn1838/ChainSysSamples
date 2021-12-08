import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtil {
	
	public Connection getDBConnect() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		
		return con;
		
	}
	
	public static void close(ResultSet rs,Statement stmt,Connection con) throws SQLException
	{
		if(rs!=null)
		{
			rs.close();
		}
		if(stmt!=null)
		{
			stmt.close();
		}
		if(con!=null)
		{
			con.close();
		}		
	}

}
