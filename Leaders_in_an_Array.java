package arrays;

import java.util.ArrayList;

public class Leaders_in_an_Array {

	public static void main(String[] args) {
		int[] nums= {1,2,5,3,1,2};
		ArrayList<Integer> leaders=new ArrayList<Integer>(10);
		leaders.add(nums[nums.length-1]);
		for(int i=nums.length-2;i>=0;i--)
		{
			if(nums[i]>leaders.get(leaders.size()-1))
			leaders.add(nums[i]);
		}
		System.out.println(leaders.reversed());
	}

}
