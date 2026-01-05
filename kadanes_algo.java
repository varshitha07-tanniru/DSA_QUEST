package arrays;

public class kadanes_algo {

	public static void main(String[] args) {
		/*
		 * nums={2,3,5,-2,7,-4}
		 * maxsum=0
		 * sum=0
		 * sum=2
		 * maxsum=2
		 * sum=5
		 * maxsum=5
		 * sum=10
		 * maxsum=10
		 * sum=8
		 * maxsum=10
		 * sum=15
		 * maxsum=15
		 * sum=-4
		 * maxsum=15
		 * final=15
		 */
		int[] nums={2,3,5,-2,7,-4};
		int sum=0,maxsum=Integer.MIN_VALUE;
		int start=0,end=0,remstart = 0,remend = 0;
		for(int num:nums)
		{
			sum+=num;
			if(sum>maxsum) {
				remend = end;
				remstart=start;
				maxsum=sum;
			}
			if(sum<0) {
				sum=0;
				start=end+1;
			}
			end+=1;
		}
		System.out.println(maxsum+" "+remstart+" "+remend);
	}

}
