package arrays;

import java.util.HashMap;
import java.util.Map;

public class count_subarrays_with_sum {

	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<>();
		int[] nums= {1,2,2,3};
		int sum=0,cnt=0,k=4;
		map.put(0, 1);
		for(int num:nums)
		{
			sum+=num;
			if(map.containsKey(sum-k))
			{
				cnt+=map.get(sum-k);
			}
			if(map.containsKey(sum))
				map.put(sum-k, map.get(sum)+1);
			else
			map.put(sum,1);	
		}
		System.out.println(cnt);
		System.out.println(map);
	}

}
