package req1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Song {
	private int id;
	private String name;
	private String artist;
	private String album;
	private double rating;
	private int noOfdownloads;
	private Date dateDownloaded;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getNoOfdownloads() {
		return noOfdownloads;
	}
	public void setNoOfdownloads(int noOfdownloads) {
		this.noOfdownloads = noOfdownloads;
	}
	public Date getDateDownloaded() {
		return dateDownloaded;
	}
	public void setDateDownloaded(Date dateDownloaded) {
		this.dateDownloaded = dateDownloaded;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Song(int id, String name, String artist, String album, double rating, int noOfdownloads,
			Date dateDownloaded) {
		super();
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.rating = rating;
		this.noOfdownloads = noOfdownloads;
		this.dateDownloaded = dateDownloaded;
	}
	@Override
	public String toString() {
		return "\nname=" + name + "\nartist=" + artist + "\nalbum=" + album + "\nrating=" + rating
				+ "\nnoOfdownloads=" + noOfdownloads + "\nDateDownloaded=" + dateDownloaded + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(album, artist, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(album, other.album) && Objects.equals(artist, other.artist)
				&& Objects.equals(name, other.name);
	}
	
	public static Song createSong(String detail) throws NumberFormatException, ParseException
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		return new Song(Integer.parseInt(detail.split(",")[0]),detail.split(",")[1], detail.split(",")[2], detail.split(",")[3], Double.parseDouble(detail.split(",")[4]),
				Integer.parseInt(detail.split(",")[5]), sdf.parse(detail.split(",")[6]));
		
	}
	

}
