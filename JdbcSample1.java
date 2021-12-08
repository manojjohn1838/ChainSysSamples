import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcSample1

{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//register Driver
		Class.forName("oracle.jdbc.OracleDriver");
		//get connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		
		String UserInsertQuery="insert into users1 (id,user_name,email) values(?,?,?)";
		
		PreparedStatement pstmt=con.prepareStatement(UserInsertQuery);
		
		char Choice='y';
		
		do
		{
		System.out.println("enter the user Details:");
		int id=Integer.parseInt(scan.nextLine());
		String name=scan.nextLine();
		String email=scan.nextLine();
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3,email);
		int i=pstmt.executeUpdate();
		System.out.println(i+" row inserted");
		System.out.println("Do you  want to continue (y/n)");
		Choice=scan.nextLine().charAt(0);
		
		}while(Choice=='y'||Choice=='Y');
		
		System.out.println("Values in the table users1");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from users1");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		
	//System.out.println(i+" row affected");
		
	
	}

}
