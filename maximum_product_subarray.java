package arrays;

public class maximum_product_subarray {

	public static void main(String[] args) {
		int[] nums = {-2, -3, 0, -2, -40};
		int maxpro=Integer.MIN_VALUE;
		/*
		 * 1)all are positive(multiplication of every element)-maximum subarray
		 * 2)even number of negative number nad remaining are positive-maximum subarry-multiplication of all elements
		 * 3)odd number of negatives
		 * for example
		 * {2,3,-1,5,6,-2,9,2,-1}
		 * here we maintain prefix and suffix sum that means 
		 * neglect one of the nefgative number and product the prefix array and suffix array
		 * {2,3}-prefix sum and {5,6,-2,9,2,-1} is my suffix sum
		 * when i neglected the negative number -1
		 * in the same we can also neglect -2 or -1(lastindex)
		 * and from this we can find which is maximum
		 * 4)having zeores
		 * for example:[2,3,4,5,0,6,7,0,9,10]
		 * so either [2,3,4,5] or [6,7] or [9,10] would be max 
		 * here the intitute is neglecting 0
		 * and finding the solution for the question
		 */
		int prefix=1,suffix=1;
		int n=nums.length;
		for(int i=0;i<n;i++)
		{
			prefix*=nums[i];
			suffix*=nums[n-i-1];
			maxpro=Math.max(maxpro, Math.max(prefix, suffix));
			if(prefix==0)
				prefix=1;
			if(suffix==0)
				suffix=1;	
		}
		System.out.println(maxpro);
		
	}
	
}
