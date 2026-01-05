package arrays;

import java.util.HashMap;
import java.util.Map;

public class largest_subarray_sum_0 {

	public static void main(String[] args) {
		
		int[] nums= {2,10,4};
		int k=0,sum=0,maxlen=0;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i];
			int rem=sum-k;
			if(map.containsKey(rem))
			{
				maxlen=Math.max(maxlen,i-map.get(rem));
			}
			if(!(map.containsKey(rem)))
			{
				map.put(sum,i);
			}
		}
		System.out.println(maxlen);
		
	}

}
