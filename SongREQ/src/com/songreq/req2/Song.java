package com.songreq.req2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Song implements Comparable<Song>
{

	private String name;
	private String artist;
	private String songType;
	private Date dateDownloaded;
	private double rating;
	private int noOfdownloads;
	
	
	
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
	public String getSongType() {
		return songType;
	}
	public void setSongType(String songType) {
		this.songType = songType;
	}
	public Date getDateDownloaded() {
		return dateDownloaded;
	}
	public void setDateDownloaded(Date dateDownloaded) {
		this.dateDownloaded = dateDownloaded;
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
	
	public Song(String name, String artist, String songType, Date dateDownloaded, double rating, int noOfdownloads) {
		super();
		this.name = name;
		this.artist = artist;
		this.songType = songType;
		this.dateDownloaded = dateDownloaded;
		this.rating = rating;
		this.noOfdownloads = noOfdownloads;
	}
	public static Song createSong(String details)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Song song=null;
		try {
			song=new Song( details.split(",")[0], details.split(",")[1], details.split(",")[2],
					sdf.parse(details.split(",")[3]), Double.parseDouble(details.split(",")[4]),Integer.parseInt(details.split(",")[5])  );
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Value must be a number");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Date Format is dd-MM-yyyy");
		}
				
		return song;		
		
	}
	@Override
	public int compareTo(Song o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		return String.format("%-15s%-15s%-15s%-15s%-15s%-15s\n", name,artist,songType,sdf.format(dateDownloaded),rating,noOfdownloads);
	}
	

}
