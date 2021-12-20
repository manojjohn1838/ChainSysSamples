package req1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SongDao {
	
	public List<Song> showSongs()
	{
		List<Song> songList=new ArrayList<Song>();
		Connection con=Dao.getDbConnect();
		String query="select * form song";
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
			Song song=new Song(rs.getInt(1), rs.getString(2),  rs.getString(3),  rs.getString(4), rs.getDouble(5), rs.getInt(6),
					rs.getDate(7));
			songList.add(song);
			
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
		
		return songList;
	}

}
