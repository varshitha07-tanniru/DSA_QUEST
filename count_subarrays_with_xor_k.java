package arrays;
import java.util.*;
public class count_subarrays_with_xor_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,6,7,8,9};
		int k=5,xor=0,rem,i,cnt=0;
		Map<Integer,Integer> map=new HashMap<>();
		map.put(0,1);
		for(i=0;i<nums.length;i++)
		{
			xor=xor^nums[i];
			rem=xor^k;
			if(map.containsKey(rem))
			{
				cnt+=map.get(rem);
			}
			map.put(xor,map.getOrDefault(xor,0)+1);
		}
		System.out.println(cnt);
	}
	/*
	 * xor=4
	 * rem=4^2=6
	 * dic={0:1,4:1}
	 * xor=4^2=6
	 * rem=6^6=0
	 * cnt=1
	 * dic={0:1,4:1,6:1}
	 * xor=6^2=4
	 * rem=4^6=2
	 * dic={0:1,4:2,6:1}
	 * xor=4^6=2
	 * rem=2^6=4
	 * cnt=3
	 * xor=2^4=6
	 * rem=6^6=0
	 * cnt+=4
	 * 
	 */

}
