package arrays;

import java.util.*;

public class merge_overlapping_subintervels {

	public static void main(String[] args)
	{
		int[][] intervals= {{5,7},{1,3},{4,6},{8,10}};
		Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
		List<int[]> merged=new ArrayList<>();
		int[] current=intervals[0];
		for(int i=1;i<intervals.length;i++)
		{
			if(current[1]>=intervals[i][0])
			{
				current[1]=Math.max(current[1],intervals[i][1]);
			}
			else
			{
				merged.add(current);
				current=intervals[i];
			}
		}
		merged.add(current);
		for(int[] interval:merged)
			System.out.println(Arrays.toString(interval));
		
	}
}
