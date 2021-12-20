package com.songreq.req2;

import java.util.Comparator;

public class RatingComparator implements Comparator<Song>
{

	@Override
	public int compare(Song s1, Song s2) {
		// TODO Auto-generated method stub
		if(s1.getRating()==s2.getRating())
		{
			return 0;
			
		}
		else if(s1.getRating()>s2.getRating())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	

}
