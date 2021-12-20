package req1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ListSample {

	public static void main(String[] args) throws NumberFormatException, ParseException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in); 
//		List<String> list =new ArrayList();
//		list.add("qwerty");
//		//list.add(123456);
//		List<Integer> list1 =new ArrayList();
//		list1.add(12345);
//		Integer i=12345;
//		
//		
//		list1.add(new Integer(1234));
//		
//		list1.add(i);
//		
//		List<Song> songList=new ArrayList<Song>();
//		
//		
//		System.out.println("Enter song details:");
//		String detail=scan.nextLine();
//		Song song=Song.createSong(detail);
//		songList.add(song);
//		
//		System.out.println(songList);
		
		Set<String> set=new TreeSet<String>();
		set.add("qwerty");
		set.add("qwerty");
		System.out.println(set);
		Set set1=new TreeSet ();
		
		Map<String,Integer> newMap=new TreeMap<String, Integer>();
		newMap.put("jan", 1);
		newMap.put("feb", 2);
		
		System.out.println(newMap.get("feb"));
		Map<Integer,String> newMap1=new TreeMap ();
		newMap1.put(1, "January");
		
		List<Song> songList=new ArrayList<Song>();
		
		Map<Song,Integer> SongCount=new TreeMap<Song, Integer>();
		//Song song=songList.get(0);
		for(int i=0;i<songList.size();i++)
		{
			if(SongCount.containsKey(songList.get(0)))
			{
				
				SongCount.put(songList.get(i), SongCount.get(songList.get(i))+1);
			}
			else
			{
				SongCount.put(songList.get(i), 1);
			}
			
			
		}
		System.out.println(songList);
		
				
		
	}

}
