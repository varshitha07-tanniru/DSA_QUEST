package arrays;

public class long_sum_k {

	public static void main(String[] args) {

		int[] nums= {-3,2,1};
		int k=6,sum=0,i,j=0,maxlen=0;
		for(i=0;i<nums.length;i++)
		{
			sum+=nums[i];
			if(sum==k)
			{
				int len=i-j+1;
				if(len>maxlen)
					maxlen=len;
			}
			while(sum>k)
			{
				sum-=nums[j];
				j+=1;
			}
		}
		System.out.println(maxlen);
	}
	
}
