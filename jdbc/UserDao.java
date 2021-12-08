import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {
	
	public void insertUser(User1 user) throws ClassNotFoundException, SQLException
	{
		ConnectionUtil conUtil=new ConnectionUtil();
		Connection con=conUtil.getDBConnect();
		
		String query="insert into users1 values(?,?,?)";
		
		PreparedStatement stmt=con.prepareStatement(query);
		stmt.setInt(1, user.getId());
		stmt.setString(2, user.getName());
		stmt.setString(3, user.getEmail());
		
		System.out.println(stmt.executeUpdate()+" row inserted");
		System.out.println("Value Inserted Successfully");
		
	}
	public void showUser() throws ClassNotFoundException, SQLException
	{
		ConnectionUtil conUtil=new ConnectionUtil();
		Connection con=conUtil.getDBConnect();
		
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from users1");
		System.out.format("%-5s%-32s%-50s\n","ID","Name","Email");
		System.out.println("---------------------------------------------------------------------");
		while(rs.next())
		{
		
			System.out.format("%-5s%-32s%-50s\n",rs.getInt(1),rs.getString(2),rs.getString(3));
		}
		ConnectionUtil.close(rs, stmt, con);
		
		
	}

}
