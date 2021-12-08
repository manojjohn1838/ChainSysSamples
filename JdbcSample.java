import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcSample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//Register the Driver
		Class.forName("oracle.jdbc.OracleDriver");
		//Get the Connection from DriverManager
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		char Choice='y';
		do
		{
		System.out.println("enter the user Details:");
		int id=Integer.parseInt(scan.nextLine());
		String name=scan.nextLine();
		String email=scan.nextLine();
		//Create statment using the connection object
		Statement stmt=con.createStatement();
		//build the query from userInput
		
		String query="insert into users1 values("+id+",'"+name+"','"+email+"')";
		System.out.println(query); 
		
		int i=stmt.executeUpdate(query);
		
		System.out.println(i+" row inserted");
		System.out.println("Do you  want to continue (y/n)");
		Choice=scan.nextLine().charAt(0);
		
		}while(Choice=='y'||Choice=='Y');
		

	}

}
