package com.songreq.req2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of songs");
		int num=Integer.parseInt(scan.nextLine());
		List<Song> songList=new ArrayList<Song>();
		for(int i=0;i<num;i++)
		{
			String details=scan.nextLine();
		Song song=Song.createSong(details);	
		songList.add(song);
			
		}
		System.out.println(songList);
		
		Collections.sort(songList);
		System.out.println(songList);
		Collections.sort(songList,new RatingComparator());
		System.out.println(songList);
		Thread th=new Thread();
		

	}

}
