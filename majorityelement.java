package arrays;

public class majorityelement {

	public static void main(String[] args) {
		/* Majority element
		 * nums={7,0,0,1,7,7,2,7,7}
		 * points=0
		 * candidate=null
		 * candidate=7
		 * points=1
		 * points=0
		 * candidate=0
		 * points=1
		 * points=0
		 * candidate=7
		 * points=1
		 * points=2
		 * points=1
		 * points=1
		 * points=1
		 * final candidate=7
		 * test cases:
		 *{1,2,3,4};No majority → should print nothing
		 *{2,2,2,2}; // All same → should print 2
		 *{3,3,4,2,4,4,2,4,4}; // Majority = 4 → should print 4
		 */
		int[] nums={3,3,4,2,4,4,2,4,4};
		int candidate=-1,points=0;
		for(int num:nums)
		{
			if(points==0)
			{
				candidate=num;
				points+=1;
			}
			else if(num!=candidate)
				points-=1;
			else
				points+=1;
		}
		int length=nums.length,cnt=0;
		for(int num:nums)
		{
			if(num==candidate)
				cnt+=1;
		}
		if(cnt>(nums.length)/2)
		System.out.println(candidate);
	}

}
