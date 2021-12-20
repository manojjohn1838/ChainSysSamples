package req1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao 
{

	public static Connection getDbConnect()
	{
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle"); 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
