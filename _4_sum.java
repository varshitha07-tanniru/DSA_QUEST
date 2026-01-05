package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4sum_ {

	public static void main(String[] args) {
		
		int[] nums= {7,-7,1,2,14,3};
		Arrays.sort(nums);
		int target=9,i,j,k,l;
		List<List<Integer>> result=new ArrayList<>(); 
		for(i=0;i<nums.length-3;i++)
		{
			if(i>0 && nums[i]==nums[i-1])
				continue;
			for(j=i+1;j<nums.length-2;j++)
			{
				if(j>i+1 && nums[j]==nums[j-1])
					continue;
			
				l=j+1;
				k=nums.length-1;
				while(l<k)
				{
					int ans=nums[i]+nums[j]+nums[k]+nums[l];
					if(ans==target)
					{
						result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
						l++;
						k--;
						while(l<k && nums[k]==nums[k+1])
							k--;
						while( l<k && nums[l]==nums[l-1])
							l++;
					}
					else if(ans<target)
						l++;
					else
						k--;
					
				}
			}
		}
		System.out.println(result);
		}
	}

