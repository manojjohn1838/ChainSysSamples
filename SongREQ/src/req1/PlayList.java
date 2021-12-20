package req1;

import java.util.List;

public class PlayList {
	
	private String name;
	
	private List<Song> songList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Song> getSongList() {
		return songList;
	}

	public void setSongList(List<Song> songList) {
		this.songList = songList;
	}

	public PlayList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlayList(String name, List<Song> songList) {
		super();
		this.name = name;
		this.songList = songList;
	}
	
	public void AddSongToPlaylist(Song song)
	{
		this.songList.add(song);
	}
	public boolean RemoveSongFromPlaylist(String name)
	{
		Song song=null;
		for(int i=0;i<this.songList.size();i++)
		{
			if(this.songList.get(i).getName().equals(name))
			{
				song=this.songList.get(i);	
			}
		}
		
		return this.songList.remove(song);
		
		
	}
	public void DisplaySongs()
	{
		for(int i=0;i<this.songList.size();i++)
		{
			System.out.println(this.songList.get(i));
		}
	}
	

}
